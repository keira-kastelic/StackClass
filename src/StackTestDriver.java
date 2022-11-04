public class StackTestDriver {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(20);
        stack.push(100);

        System.out.println(stack.isEmpty());

        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());

    }
}
