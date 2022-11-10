public class Stack<N> {
    private int size = 1; // creating instance data
    private StackNode top;
    private N data;

    public Stack(){
    }

    public void push(N data){
        top = new StackNode <N> (top, data);
        size ++;
    }

    public N pop(){
        N data = (N) top.getData();
        top.setData(null);
        return data;
    }

    public N peek() {
        return (N) top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

}
