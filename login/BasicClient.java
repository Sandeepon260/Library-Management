package login;
import java.io.*;


//@author: Mehregan Mesgari

class BasicClient implements Client {
    private static final String CSV_FILE = "users.csv";

    @Override
    public void register(String email, String password) {
        // Check if email already exists in the CSV file
        if (emailExists(email)) {
            System.out.println("Email already exists. Registration failed.");
            return;
        }

        try (FileWriter fw = new FileWriter(CSV_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(email + "," + password);
            System.out.println("Registration successful.");
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }

    @Override
    public String getPassword(String email) {
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(email)) {
                    return data[1];
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from CSV file: " + e.getMessage());
        }
        return null; // Email not found or error occurred
    }

    private boolean emailExists(String email) {
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(email)) {
                    return true; // Email already exists
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from CSV file: " + e.getMessage());
        }
        return false; // Email not found or error occurred
    }
}
