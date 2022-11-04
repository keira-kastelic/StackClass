public class Stack<N> {
    private int size = 0;
    private StackNode top;
    private StackNode next;
    private N data;

    public void push(N data){
        StackNode temp = new StackNode(data);
        if(top != null){
            top = top.setNext(temp);
        }
        top = temp;
    }

    public N pop(){
        N data = top.getData();
        top.setData(null);
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public N peek() {
        return top.getData();
    }

}
