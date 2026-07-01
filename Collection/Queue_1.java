import java.util.*;

public class Queue_1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(11);
        queue.offer(22);
        queue.offer(33); // offer => if the Queue is Successfull, offer will return true, if not it will return false
        System.out.println("Queue: " + queue);

        System.out.println("Head of the queue: " + queue.peek()); // peek => returns the head of the queue without removing it
         
        queue.poll(); // poll => removes the head of the queue and returns it, if the queue is empty it will return null
        System.out.println("Queue after poll: " + queue);
    }
}
