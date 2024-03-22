package search;
import items.*;
import libraryManagement.*;
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
	List<LibraryItem> ExactMatchResult = new ArrayList<>();
	List<LibraryItem> RecommendationResult = new ArrayList<>();
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
//        constraints.gridwidth = ;

		if(!ExactMatchResult.isEmpty()) {
            constraints.gridy += 1;
            String title = ExactMatchResult.get(0).getDetails();
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
				LibraryItem LibraryItem = RecommendationResult.get(i);
				System.out.println(LibraryItem.getDetails());
            	JLabel resultLabel = new JLabel();
            	resultLabel.setText(LibraryItem.getDetails());
                constraints.gridy += 1;
                panel.add(resultLabel, constraints);
			}
			
		}

		
		frame.setSize(1000, 600);
//		frame.pack();
//		panel.revalidate();
//		panel.repaint();
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Search Screen");

		frame.revalidate();
		frame.repaint();
		frame.setVisible(true);
	}
		
	public SearchGUI(){
		createGUI();
	}
	public SearchGUI(String user) {
		this.userEmail = user;
		createGUI();
	}
	
	public static void main(String[] args) {
		new SearchGUI("hello");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

		actionCounter += 1;
		System.out.println("actionCounter; " + actionCounter);
		
		if (e.getSource() == SearchButton) {
			String searchTerm = SearchField.getText().trim();

			
	        SearchStrategy searchByTitleStrategy = new searchByTitle();
	        
	        SearchStrategy recommendationsStrategy = new recommendations();

	        // Create the LibraryItemSearchContext with the searchByTitleStrategy
	        SearchContext searchContext = new SearchContext(searchByTitleStrategy);
	        
	        //
	        
	        
	        
	        List<LibraryItem> LibraryItems = new ArrayList<>();
//	        
	        
//	        String line = "";
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
						items.LibraryItem newLibraryItem = LibraryItemFactory.createItem(type, "", price, rented, purchasable, title, author);
//						switch (type) {
//							case "Book":
//								newLibraryItem = new Book(location, purchasable, title, author);
//								break;
//							case "CD":
//								newLibraryItem = new CD(location, purchasable, title, author);
//								break;
//							case "Magazine":
//								newLibraryItem = new Magazine(location, purchasable, title, author);
//								break;
//							default:
//								throw new NullPointerException();
//						}
						LibraryItems.add(newLibraryItem);
					}		
					
					
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	        
//	        System.out.println(LibraryItems.get(0).getDetails());
//	        System.out.println(LibraryItems.size());
	        
	        
//	          LibraryItems.add(new LibraryItem("0", true, "The great Gatsby","0"));
//	        LibraryItems.add(new LibraryItem("1", true,"To Kill a Mockingbird novel help", "0"));
//	        LibraryItems.add(new LibraryItem("2", true,"1984", "0"));
//	        LibraryItems.add(new LibraryItem("3", true,"Pride and Prejudice", "0"));
//	        LibraryItems.add(new LibraryItem("4", true,"The Catcher in the Rye", "0"));
//	        LibraryItems.add(new LibraryItem("5", true,"The Catcher in the Rye novel help", "0"));
	        //create csv later
	        
	        
			// Determine the appropriate strategy based on the input
	        if(searchTerm.equals("")) {
	        	ExactMatchResult = new ArrayList<>();
	        	RecommendationResult = new ArrayList<>();
	        }
			else {
			    // Use searchByTitleStrategy and get recommendations
			    searchContext = new SearchContext(searchByTitleStrategy);
			    ExactMatchResult = searchContext.search(LibraryItems, searchTerm);
			    searchContext = new SearchContext(recommendationsStrategy);
			    RecommendationResult = searchContext.search(LibraryItems, searchTerm);
			}
//			
//	        panel.revalidate();
//			panel.repaint();
			createGUI();
		}
		
		if (e.getSource() == rentButton) {
//			try {
//				BufferedReader br = new BufferedReader(new FileReader(path));
//				String line;
//				line = br.readLine();
//				
//				String updatedCSV = "";
//				Boolean flag = false;
//				while((line = br.readLine()) != null) {
//					String[] values = line.split(",");
//					String ID = values[0];
//					String type = values[1];
//					String title = values[2];
//					String author = values[3];
//					boolean purchasable = values[4].equals("true") ?  true : false;
//					String location= values[5];
//					boolean available = values[6].equals("true") ?  true : false;
//					if(title.equals(ExactMatchResult.get(0).getTitle()) & available == true & flag == false) {
//						values[6] = "false";
//						String updatedLine = "";
//						for (String val: values) {
//							updatedLine += val + ",";
//							flag = true;
//						}
//						updatedCSV += updatedLine + "\n";
//						
//					}else {
//						updatedCSV += line + "\n";
//					}
//				}
//				BufferedWriter writer = new BufferedWriter(new FileWriter(path));
//	            writer.write(updatedCSV);
//
//			}
//			 catch (IOException e2) {
//	            e2.printStackTrace();
//	        }
	    }
	}
			
			
}
