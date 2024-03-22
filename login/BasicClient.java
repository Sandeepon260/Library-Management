package login;import java.io.*;
import java.util.ArrayList;
import java.util.List;

import items.LibraryItem;

/*
 * BasicClient is the basic version of the client that will pass onto decorator to add the other needed features to 
 * this class contains an DB and an arraylist to keep track of the borrowed items for each user
 */

class BasicClient implements Client {
    private static final String CSV_FILE = "users.csv";
    public ArrayList<LibraryItem> borrowed = new ArrayList<>();



    public void register(String email, String password, String role) {
        if (emailExists(email)) {
            System.out.println("Email already exists. Registration failed.");
            return;
        }

        try (FileWriter fw = new FileWriter(CSV_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(email + "," + password + "," + role + "," + "pending");
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
        return null; 
    }

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
        return null; 
    }

    public void setValidatedStatus(String email, boolean validated) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(email)) {
                    data[3] = String.valueOf(validated);
                    line = String.join(",", data);
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from CSV file: " + e.getMessage());
        }

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
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from CSV file: " + e.getMessage());
        }
        return false;
    }


}
