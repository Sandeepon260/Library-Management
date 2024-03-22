package libraryManagement;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;
import items.Book;
import items.LibraryItem;

public class StudentLibrary extends Library {

    private Map<String, Integer> virtualCopies;  // Map to store the virtual copies associated with each student

    public StudentLibrary() {
        super();
        virtualCopies = new HashMap<>();
    }

    // Method to make virtual copies available to a student for the duration of the course
    public void makeVirtualCopiesAvailable(String studentEmail, String courseName, int durationInMonths) {
        int copies = virtualCopies.getOrDefault(studentEmail, 0);
        copies += durationInMonths;
        virtualCopies.put(studentEmail, copies);
        System.out.println("Virtual copies of textbooks for course '" + courseName + "' made available to student '" + studentEmail + "' for " + durationInMonths + " months.");
    }

    public int getVirtualCopies(String studentEmail) {
        return virtualCopies.getOrDefault(studentEmail, 0);
    }


    public LibraryItem findItemByTitle(String title) {
        for (LibraryItem item : items) {
        	
            if (item.getItemType().equalsIgnoreCase("book") && item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        System.out.println("Book with title '" + title + "' not found.");
        return null;
    }

    @Override
    public void addItem(String itemType, String title, String additionalInfo) {
        super.addItem(itemType, title, additionalInfo);
        
        // Check if the added item is a textbook
        if (itemType.equalsIgnoreCase("book") && additionalInfo != null) {
            // Extract course name from additionalInfo (assuming it contains the course name)
            String[] parts = additionalInfo.split(",");
            if (parts.length >= 2) {
                String courseName = parts[0].trim();
                // Assuming parts[1] contains student email
                String studentEmail = parts[4].trim();
                // Make virtual copies available for the student for a default duration of 1 month
                makeVirtualCopiesAvailable(studentEmail, courseName, 1);
            }
        }
    }

    @Override
    public void returnItem(int itemId) {
        // Override the returnItem method to remove virtual copies when a book is returned
        super.returnItem(itemId);
        LibraryItem item = findItemById(itemId);
        if (item != null && item instanceof Book) {
        	 
        	 System.out.println("Virtual copy removed from student '" + item.getBorrowerEmail() + "'.");
        	 // reset the copies to 0. 
        	 virtualCopies.put(item.getBorrowerEmail(), 0);
        	 item.setBorrowerEmail(null); 
        }
    }
    
    
    
    public void rentItem(String title,String email)
    {
    	for (LibraryItem libraryItem : items) {
			
    		if (libraryItem.getTitle().equals(title))
    		{
    			// book found
    			libraryItem.setBorrowerEmail(email);
    			libraryItem.rentItem(LocalDate.now(ZoneId.systemDefault()), 30, email);
//    			libraryItem.rentItem(LocalDate.of(2024, 3, 12), 30, email);
    			break;
    		}
		}
    }
    public String check_overdues(String email)
    {
    	String out="Title					overdue amount:\n";
    	for (LibraryItem libraryItem : items) {
			
    		if (libraryItem.getBorrowerEmail().equals(email))
    		{
    			// book found
    			out += libraryItem.getTitle() +" : " + libraryItem.calculateOverduePenalty()+"\n";
    			
    		}
		}
    	return out;
    	
    }
    
    
    
}





