package search;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class SearchGUI implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JLabel SearchPrompt = new JLabel("Enter search:");
	JTextField SearchField = new JTextField(20);
	JButton SearchButton = new JButton("Search");
	
	JButton rentButton = new JButton("Rent");

	int actionCounter = 0;
	List<Book> ExactMatchResult = new ArrayList<>();
	List<Book> RecommendationResult = new ArrayList<>();
	
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
            constraints.gridx = 1;
            
            rentButton.addActionListener((ActionListener) this);
            panel.add(rentButton, constraints);
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
				Book book = RecommendationResult.get(i);
				System.out.println(book.getDetails());
            	JLabel resultLabel = new JLabel();
            	resultLabel.setText(book.getDetails());
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
		
	
	public SearchGUI() {
		createGUI();
	}
	
	public static void main(String[] args) {
		new SearchGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

		actionCounter += 1;
		System.out.println("actionCounter; " + actionCounter);
		
		if (e.getSource() == SearchButton) {
			String searchTerm = SearchField.getText().trim();

			
	        SearchStrategy searchByTitleStrategy = new searchByTitle();
	        
	        SearchStrategy recommendationsStrategy = new recommendations();

	        // Create the BookSearchContext with the searchByTitleStrategy
	        SearchContext searchContext = new SearchContext(searchByTitleStrategy);
	        
	        //
	        
	        
	        
	        List<Book> books = new ArrayList<>();
//	        
	        String path = "resources/library.csv";
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
					String location= values[5];
		
					if(type.equals("Book")) {
						Book newBook = new Book(location, purchasable, title, author);
						books.add(newBook);
					}
					
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	        
//	        System.out.println(books.get(0).getDetails());
//	        System.out.println(books.size());
	        
	        
//	          books.add(new Book("0", true, "The great Gatsby","0"));
//	        books.add(new Book("1", true,"To Kill a Mockingbird novel help", "0"));
//	        books.add(new Book("2", true,"1984", "0"));
//	        books.add(new Book("3", true,"Pride and Prejudice", "0"));
//	        books.add(new Book("4", true,"The Catcher in the Rye", "0"));
//	        books.add(new Book("5", true,"The Catcher in the Rye novel help", "0"));
	        //create csv later
	        
	        
			// Determine the appropriate strategy based on the input
	        if(searchTerm.equals("")) {
	        	ExactMatchResult = new ArrayList<>();
	        	RecommendationResult = new ArrayList<>();
	        }
			else {
			    // Use searchByTitleStrategy and get recommendations
			    searchContext = new SearchContext(searchByTitleStrategy);
			    ExactMatchResult = searchContext.search(books, searchTerm);
			    searchContext = new SearchContext(recommendationsStrategy);
			    RecommendationResult = searchContext.search(books, searchTerm);
			}
//			
//	        panel.revalidate();
//			panel.repaint();
			createGUI();
		}
		
		if (e.getSource() == rentButton) {
			new SearchGUI();
			System.out.println("renting " + ExactMatchResult.get(0).getTitle());
		}
		
        
	}
}