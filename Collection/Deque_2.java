import java.util.*;

public class Deque_2 {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>(); 
        queue.offerFirst(10); // offerFirst => adds an element to the front of the deque
        queue.offerFirst(20);
        queue.offerFirst(30);
        
        queue.offerLast(11);
        queue.offerLast(22);
        queue.offerLast(33); // offerLast => adds an element to the end of the deque
        System.out.println("Queue: " + queue);

        System.out.println("Head of the queue: " + queue.peekFirst()); // peekFirst => returns the first element of the deque without removing it
        System.out.println("Tail of the queue: " + queue.peekLast()); // peekLast => returns the last element of the deque without removing it

        queue.pollFirst(); // pollFirst => removes and returns the first element of the deque, if the deque is empty it will return null
        System.out.println("Queue after pollFirst: " + queue);
    }
}
