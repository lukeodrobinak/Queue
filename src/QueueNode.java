
public class QueueNode<T> {

    private T data; //The data value contained in the node
    private QueueNode parent; //Reference to the parent node

    //Default constructor
    public QueueNode() {
        this.data = null;
        this.parent = null;
    }

    //Constructor that sets data of the node
    public QueueNode(T data) {
        this.data = data;
    }

    //Constructor that sets data and parent node
    public QueueNode (T data, QueueNode parent) {
        this.data = data;
        this.parent = parent;
    }

    //Returns the data stored in the node
    public T getData() {
        return data;
    }

    //Sets the data for this node
    public void setData(T data) {
        this.data = data;
    }

    //Returns the parent node
    public QueueNode getParent() {
        return parent;
    }

    //Sets the parent node for this node
    public void setParent (QueueNode parent) {
        this.parent = parent;
    }

    //Provides a string representation of the node by converting its data to a string
    public String toString() {
        return "QueueNode: " + this.data.toString();
    }

    //Compares the data of the node with the data of another node 'comparison'
    public boolean equals(QueueNode comparison) {
        return this.data.equals(comparison.getData());
    }
}
