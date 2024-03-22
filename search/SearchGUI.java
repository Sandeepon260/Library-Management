package search;
import items.*;
import login.*;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
// This is the GUI for the search functionality where the context is set and switched for exact match and recommendations. 
public class SearchGUI implements ActionListener{
	String userEmail;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JLabel SearchPrompt = new JLabel("Enter search:");
	JTextField SearchField = new JTextField(20);
	JButton SearchButton = new JButton("Search");
	
	JButton rentButton = new JButton("Rent");
	JButton purchase = new JButton("Purchase");
	int actionCounter = 0;
	List<String> ExactMatchResult = new ArrayList<>();
	List<String> RecommendationResult = new ArrayList<>();
	String path = "library.csv";
	private void createGUI() {
		
		frame.getContentPane().removeAll();
		panel.removeAll();
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
		
        constraints.gridx = 0;
        constraints.gridy = 0;
		panel.add(SearchPrompt, constraints);
		
		constraints.gridx = 1;
        constraints.gridy = 0;
		panel.add(SearchField, constraints);
		
		SearchButton.addActionListener((ActionListener) this);
		constraints.gridx = 2;
        constraints.gridy = 0;
		panel.add(SearchButton, constraints);

		
		constraints.gridx = 0;


		if(!ExactMatchResult.isEmpty()) {
            constraints.gridy += 1;
            String title = "Book: " + ExactMatchResult.get(0);
            panel.add(new JLabel("Exact Match: "), constraints);
            constraints.gridy += 1;
            panel.add(new JLabel(title), constraints);
            constraints.gridx = 2;
            rentButton.addActionListener((ActionListener) this);
            panel.add(rentButton, constraints);
            
            
            constraints.gridx = 3;
            purchase.addActionListener((ActionListener) this);
            panel.add(purchase, constraints);

            
            constraints.gridx = 0;
        } else {
            constraints.gridy += 1;
            String title = "Exact Match: No matches found";
            panel.add(new JLabel(title), constraints);
        }
		

		if(!RecommendationResult.isEmpty()) {

            constraints.gridy += 1;
            panel.add(new JLabel("Recomendations: "), constraints);
			for (int i = 0; i < RecommendationResult.size(); i++) {
				String name = RecommendationResult.get(i);
            	JLabel resultLabel = new JLabel();
            	resultLabel.setText("Book: " + name);
                constraints.gridy += 1;
                panel.add(resultLabel, constraints);
			}
			
		}

		
		frame.setSize(1000, 600);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Search Screen");

		frame.revalidate();
		frame.repaint();
		frame.setVisible(true);
	}
		
	public SearchGUI() {
		createGUI();
	}
	public SearchGUI(String user) {
		this.userEmail = user;
		createGUI();
	}
	
	public static void main(String[] args) {
		new SearchGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource() == SearchButton) {
			String searchTerm = SearchField.getText().trim();

			
	        SearchStrategy searchByTitleStrategy = new searchByTitle();
	        
	        SearchStrategy recommendationsStrategy = new recommendations();

	        
	        SearchContext searchContext = new SearchContext(searchByTitleStrategy);
	        
	        
	        
	        
	        
	        List<String> LibraryItems = new ArrayList<>();

	        try {
				BufferedReader br = new BufferedReader(new FileReader(path));
				String line = br.readLine();
				while((line = br.readLine()) != null) {
					String[] values = line.split(",");
					String ID = values[0];
					String type = values[1];
					String title = values[2];
					String author = values[3];
					boolean purchasable = values[4].equals("true") ?  true : false;
					String price = values[5];
					boolean rented = values[6].equals("true") ?  true : false;
					if(!rented) {
						if(type.equals("Book")) {
							
							LibraryItems.add(title);
						}
						
					}		
					
					
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	        
	        
			
	        if(searchTerm.equals("")) {
	        	ExactMatchResult = new ArrayList<>();
	        	RecommendationResult = new ArrayList<>();
	        }
			else {
			    // Use searchByTitleStrategy and get recommendations
			    searchContext = new SearchContext(searchByTitleStrategy);
			    ExactMatchResult = searchContext.search(LibraryItems,searchTerm);
			    searchContext = new SearchContext(recommendationsStrategy);
			    RecommendationResult = searchContext.search(LibraryItems, searchTerm);
			}

			createGUI();
		}
		
		if (e.getSource() == rentButton) {
			JOptionPane.showMessageDialog(null, "Book is rented!");
	    }
		if(e.getSource() == purchase) {
			new PaymentFormGUI(new RentalSystemGUI(), ExactMatchResult.get(0));
		}
	}
			
			
}
