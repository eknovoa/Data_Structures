import java.util.Stack;

class AnotherStack {
  
  public static void main (String[] args) {
    Stack<String> stack = new Stack<String>();
    
    stack.push("Plate 1");
    stack.push("Plate 2");
    stack.push("Plate 3");
    stack.push("Plate 4");
    stack.push("Plate 5");
    stack.push("Plate 6");
    
    System.out.println("Plate currently on top of our stack of plates: " + stack.peek());
    System.out.println("Plate Removed First: " + stack.pop());
    System.out.println("Plates currently left on our stack " + stack);
  }
    
}
