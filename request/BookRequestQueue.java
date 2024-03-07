package request;

import java.util.PriorityQueue;

public class BookRequestQueue {
    private PriorityQueue<BookRequest> queue;

    public BookRequestQueue() {
        this.queue = new PriorityQueue<>();
    }

    public void addBookRequest(BookRequest request) {
        queue.offer(request);
        System.out.println("Added request for " + request.getBookTitle() + " by " + request.getRequester());
    }

    public void processRequests() {
        while (!queue.isEmpty()) {
            BookRequest request = queue.poll();
            System.out.println("Processing request: " + request.getBookTitle() + ", Requester: " + request.getRequester());

        }
    }
}