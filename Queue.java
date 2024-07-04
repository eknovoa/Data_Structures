import java.util.*;

class Queue {
  
  public static void main (String[] args) {
    Queue<String> queue = new LinkedList<>();
    
    // add elements to queue
    queue.add("customer 1");
    queue.add("customer 2");
    queue.add("customer 3");
    queue.add("customer 4");
    queue.add("customer 5");
    
    // print queue
    System.out.println("Queue: " + queue);
    
    // remove element from front of queue
    System.out.println("The first customer helped: " + queue.remove());
    System.out.println("Next customer ticket coming up: " + queue.peek());
  }
    
}
