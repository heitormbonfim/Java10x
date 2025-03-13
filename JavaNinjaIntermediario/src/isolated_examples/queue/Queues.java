package isolated_examples.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
  public static void main(String[] args) {
    // THE INVERSE OF STACK (FILO = Firs In Last Out) = (FIFO = FIRST IN FIRST OUT)
    Queue<String> ninjasQueue = new LinkedList();
    ninjasQueue.add("Naruto");
    ninjasQueue.add("Sasuke");
    ninjasQueue.add("Sakura");
    ninjasQueue.add("Kakashi");
    System.out.println("Queue: " + ninjasQueue);
    ninjasQueue.poll(); // remove the first one (camel head);
    System.out.println("After Poll: " + ninjasQueue);
    System.out.println("Peek: " + ninjasQueue.peek()); // get the head of the queue
    ninjasQueue.add("Hashirama");
    ninjasQueue.add("Tobirama");
    System.out.println(ninjasQueue);

    // check if it's empty
    if (ninjasQueue.isEmpty()) {
      System.out.println("It's empty");
    } else {
      System.out.println("It's not empty");
    }
  }
}
