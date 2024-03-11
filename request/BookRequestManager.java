package request;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookRequestManager {
    private static final String CSV_FILE = "book_requests.csv";

    public static void saveNewRequest(String title, String requester, String type, int priority) {
        try (FileWriter fw = new FileWriter(CSV_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(title + "," + requester + "," + type + "," + priority + ",pending");
            System.out.println("Saved new request for: " + title);
        } catch (IOException e) {
            System.err.println("Error writing to CSV: " + e.getMessage());
        }
    }

    public static List<String> getAllPendingRequests() {
        List<String> pendingRequests = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if ("pending".equals(values[4])) {
                    pendingRequests.add(String.join(", ", values));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from CSV: " + e.getMessage());
        }
        return pendingRequests;
    }

    public static void updateRequestStatus(String requestDetails, String status) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(requestDetails)) {
                    String[] values = line.split(",");
                    values[4] = status; // Update status
                    line = String.join(",", values);
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from CSV for update: " + e.getMessage());
            return;
        }
        // Write all lines back to the file
        try (PrintWriter out = new PrintWriter(new FileWriter(CSV_FILE))) {
            for (String line : lines) {
                out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error writing updated CSV: " + e.getMessage());
        }
    }
}