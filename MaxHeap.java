import java.util.PriorityQueue;
import java.util.Collections;
public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(5);
        maxHeap.add(10);
        maxHeap.add(2);
        maxHeap.add(8);
        System.out.println("Max element: " + maxHeap.peek());
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }
}                                                                                                                                                                                                                                   