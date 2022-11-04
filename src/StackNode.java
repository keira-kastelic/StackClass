public class StackNode<N> {
    // variables
    private StackNode next; // creating private variables to store in the node type
    private N data;

    // constructors
    public StackNode () {} // creating an empty constructor

    public StackNode (N data){ // creating a data note constructor
        this.data = data;
    } // creating a constructor to se the node data

    public StackNode ( StackNode next, N data){ // creating a constructor to read in the variables
        this.next = next;
        this.data = data;
    }

    // methods
    // accessors

    public StackNode<N> getNext(){ // creating a get child accessor method
        return next; // accessing next
    }

    public N getData(){ // creating a get data accessor method
        return this.data; // accessing data
    }

    // mutators

    public void setNext(StackNode<N> next){ // creating a mutator method for the next variable
        this.next = next; // setting next
    }

    public void setData(N data){ // creating a mutator method for the data variable
        this.data = data; // setting data
    }

    // other methods
    public String toString() { // creating a .toString method for the node class
        String print = ""+ data;
        return print; // creating the format of the prints string
    }

    public boolean equals(StackNode node1, StackNode node2){ // creating an .equals method for the node class
        if (node1.getData() == node2.getData()){ // checking if the data is equal
            return true;
        } else {
            return false;
        }
    }

}
