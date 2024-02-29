import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.SwingUtilities;

public class RegistrationSystem {
    public static void main(String[] args) {
    	
    	
//    	CSVFileUtil.clearCSVFile(); // Clear CSV file on startup
//    	SwingUtilities.invokeLater(RegistrationLoginGUI::new);
    	
    	
//        Client student = new ValidationProxy(new StudentClient(new BasicClient()));
//        student.register("student@gmail.com", "S3cureP@ss!");
//
//        Client faculty = new ValidationProxy(new FacultyClient(new BasicClient()));
//        faculty.register("faculty@gmail.com", "F@cultyP@ss1");
//
//        System.out.println(student.getPassword("student@gmail.com"));
        try (BufferedReader br = new BufferedReader(new FileReader("users.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Process the line
                String[] data = line.split(",");
                System.out.println("Email: " + data[0] + ", Password: " + data[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}