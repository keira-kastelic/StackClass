public class StackTestDriver {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>(); // creating a new stack
        stack.push(1); // adding to the stack
        stack.push(20);
        stack.push(100);

        System.out.println(stack.size()); // testing the size method (should print 3)

        System.out.println(stack.isEmpty()); // testing if the stack is empty (should return false)

        System.out.println(stack.peek()); // testing peek (should print 100)

        stack.pop(); // removes the top node
        System.out.println(stack.pop()); // testing pop (should return 20)
        stack.pop(); // emptying the stack
        System.out.println(stack.pop()); // testing what happens when the stack is already emptied

        System.out.println(stack.isEmpty()); // testing if the stack is empty (should return true)

        System.out.println(stack.size()); // testing the size when the stack is empty (should return 0)

    }
}
