package Classes;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ServerQueue {
    private Queue<Client> requestQueue = new PriorityQueue<>((c1, c2) -> c2.getPriority() - c1.getPriority());
    private Queue<String> requestStatistics = new LinkedList<>();

    public void addClientRequest(Client client) {
        requestQueue.offer(client);
    }

    public Client getNextClientRequest() {
        return requestQueue.poll();
    }

    public void addRequestStatistics(String statistics) {
        requestStatistics.offer(statistics);
    }

    public String getRequestStatistics() {
        return requestStatistics.poll();
    }

    public boolean hasMoreClientRequests() {
        return !requestQueue.isEmpty();
    }

    public boolean hasMoreRequestStatistics() {
        return !requestStatistics.isEmpty();
    }
}
