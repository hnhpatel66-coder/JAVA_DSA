import java.util.*;

public class priorityQueue_3 {
    public static void main(String[] args) {

        // defult Behaavior -> Integers -> less Value -> High Priority -> minHeap

        Queue<Integer> queue = new PriorityQueue<>((a,b)-> a-b); // maxHeap
        queue.offer(11);
        queue.offer(22);
        queue.offer(33); 
        queue.offer(1);
        System.out.println("Queue: " + queue);

        System.out.println("Head of the queue: " + queue.peek()); 

        queue.poll(); 
        System.out.println("Queue after poll: " + queue);
    }
}
