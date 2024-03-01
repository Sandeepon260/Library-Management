package login;
import java.io.*;

import javax.swing.SwingUtilities;

public class CSVFileUtil {
    private static final String CSV_FILE = "users.csv";

    // Method to clear the contents of the CSV file
    public static void clearCSVFile() {
        try (PrintWriter writer = new PrintWriter(CSV_FILE)) {
            writer.print(""); // Clears the file content
            System.out.println("CSV file cleared successfully.");
        } catch (FileNotFoundException e) {
            System.err.println("Error clearing CSV file: " + e.getMessage());
        }
    }
}
/*
public static void main(String[] args) {
CSVFileUtil.clearCSVFile(); // Clear CSV file on startup
SwingUtilities.invokeLater(RegistrationLoginGUI::new);
}
*/