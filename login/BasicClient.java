package login;import java.io.*;
import java.util.ArrayList;
import java.util.List;

class BasicClient implements Client {
    private static final String CSV_FILE = "users.csv";



    public void register(String email, String password, String role) {
        if (emailExists(email)) {
            System.out.println("Email already exists. Registration failed.");
            return;
        }

        try (FileWriter fw = new FileWriter(CSV_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(email + "," + password + "," + role + "," + "pending"); // Include approved status
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

    // Add a method to get the role of a user
    public String getRole(String email) {
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(email)) {
                    return data[2];
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from CSV file: " + e.getMessage());
        }
        return null; // Email not found or error occurred
    }

    // Add a method to set the validated status of a user
    public void setValidatedStatus(String email, boolean validated) {
        // Load existing data
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(email)) {
                    // Update the validated status
                    data[3] = String.valueOf(validated);
                    line = String.join(",", data);
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from CSV file: " + e.getMessage());
        }

        // Rewrite the CSV file with updated data
        try (FileWriter fw = new FileWriter(CSV_FILE);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            for (String line : lines) {
                out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
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
