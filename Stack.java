// Stack implementation in Java
// LIFO data structure

class Stack {
    private String array[];
    private int top;
    private int capacity;

    // Stack Constructor - creating new stack
    Stack(int size) {
        array = new String[size];
        capacity = size;
        top = -1;
    }

    // Add elements to the top of the stack
    public void push(String s) {
        if (isFull()) {
            System.out.println("Stack OverFlow\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Customer added: " + s);
        array[++top] = s;
    }

    // Remove top element from stack
    public String pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            System.exit(1);
        }
        return array[top--];
    }

    //Returns the top element of the stack without removing it
    public String peek() {
        return array[top];
    }

    // return the size of the stack
    public int getSize() {
        return top + 1;
    }

    // Check to see if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // Check to see if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    //prints each item of stack starting at the top of the stack to the bottom
    public void printStack() {
        System.out.println("Printing from top of the stack...");
        for (int i = top; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push("Kyra");
        stack.push("Sally");
        stack.push("Wesley");
        stack.push("Josh");

        System.out.println("Item at top of stack before pop: " + stack.peek());
        System.out.println("Item popped: " + stack.pop());
        System.out.println("Item at top of stack after pop: " + stack.peek());
        System.out.println("\nAfter popping items:");

        stack.printStack();
    }
}