public class Stack<N> {
    private int size = 0; // creating instance data
    private StackNode top;
    private N data;

    public Stack(){ // creating an empty stack constructor
    }

    public void push(N data){ // creating the push method
        top = new StackNode <N> (top, data); // setting top to be the new node and intaking the data
        size ++; // updating size
    }

    public N pop(){ // creating the pop method
        if (isEmpty()){ // testing if the stack is empty
            size = 0; // updating size
            return null; // returning null
        } else {
            data = (N) top.getData(); // setting the data to a data variable
            StackNode temp = top; // creating a temporary node
            top = top.getNext(); // setting the top to the next node
            temp.setNext(null); // setting the temp to null
            size --; // updating size
            return data; // returning data
        }
    }

    public N peek() { // creating a peek method
        return (N) top.getData(); // returning the top node data
    }

    public boolean isEmpty() { // creating a isEmpty method
        return top == null; // testing if the stack is empty or not
    }

    public int size() { // creating a size method
        return size; // retuning size
    }

}
