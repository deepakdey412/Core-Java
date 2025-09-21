package List;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
//        Stack class → extends Vector class → implements List indirectly.

        Stack<Integer> stack = new Stack<>();

        // push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // peek (top element)
        System.out.println("Top element: " + stack.peek());

        // pop (remove top element)
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // search element (1-based position from top)
        System.out.println("Position of 10: " + stack.search(10));

        // isEmpty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
