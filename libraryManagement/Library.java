package libraryManagement;

import items.LibraryItem;
import items.LibraryItemFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private static final String CSV_FILE_PATH = "library.csv";

    public Library() {
        createCsvFile();
    }

    public void addItem(String itemType, String title, String additionalInfo) {
        LibraryItem item = LibraryItemFactory.createItem(itemType, title, false, additionalInfo, additionalInfo);
    
     
    }

    public void enableRental(int itemId) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (Integer.parseInt(parts[0]) == itemId) {
                    parts[7] = "true"; 
                }
                lines.add(String.join(",", parts));
            }
        } catch (IOException e) {
            System.err.println("Error enabling rental: " + e.getMessage());
            return;
        }

        writeLinesToFile(lines);
        System.out.println("Rental enabled for item with ID " + itemId);
    }

    public void disableRental(int itemId) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (Integer.parseInt(parts[0]) == itemId) {
                    parts[7] = "false"; // Disable rental
                }
                lines.add(String.join(",", parts));
            }
        } catch (IOException e) {
            System.err.println("Error disabling rental: " + e.getMessage());
            return;
        }

        writeLinesToFile(lines);
        System.out.println("Rental disabled for item with ID " + itemId);
    }

    private void createCsvFile() {
        File file = new File(CSV_FILE_PATH);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("CSV file created: " + CSV_FILE_PATH);
            } catch (IOException e) {
                System.err.println("Error creating CSV file: " + e.getMessage());
            }
        }
    }

    private void writeLinesToFile(List<String> lines) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CSV_FILE_PATH))) {
            for (String line : lines) {
                writer.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }
    
    
}
