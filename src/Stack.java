public class Stack<N> {
    private int size = 1;
    private StackNode top;
    private N data;

    public void push(N data){
        StackNode temp = new StackNode(data);
        while(top != null){
            temp = top.getNext();
        }
        top = temp;
        top.setData(data);
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
