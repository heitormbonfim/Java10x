package isolated_examples.stack;

import java.util.Stack;

public class StackExample {
  public static void main(String[] args) {
    // 1. O último que entra é o primeiro que sai
    Stack<String> ninjaStack = new Stack<>();
    ninjaStack.push("Naruto");
    ninjaStack.push("Kakashi");
    ninjaStack.push("Sakura");
    System.out.println(ninjaStack);
    System.out.println("Peek: " + (ninjaStack.peek())); // ver o último item da stack
    ninjaStack.pop();
    System.out.println("------ after pop ------");
    System.out.println(ninjaStack);
    System.out.println("Tamanho da stack: " + ninjaStack.size());
  }
}
