/**
 * Queue.java
 * Authors: Luke O’Drobinak
 * Date: 11/10/2023
 * Collaborators:
 * Citations: Google, Stack Overflow
 **/
public class Queue <T> {

    private int size; //size
    private QueueNode bottom; //bottom element
    private QueueNode top; // top element


    public Queue(){         // default constructer
        size = 0;
        bottom = null;
        top = null;
    }

    public void enqueue(T data){ // push method

        if (size == 0){ // if the size is 0
            bottom = new QueueNode(data); // creates a new QueueNode with the data
            top = bottom; // sets the top and bottom to the same element
            size++; // adds to size
            return;
        }

        size++; // adds to size
        QueueNode addition = new QueueNode(data); // creates a new QueueNode with the data
        top.setParent(addition); // sets the top element to the new element
        top = addition; // sets the new top element
    }

    public T dequeue(){ // pop method
        size--; // subtracts from the 1 from the size
        QueueNode oldBottom = bottom;
        bottom = bottom.getParent(); // sets the new bottom
        return (T)oldBottom.getData(); // returns the deleted element
    }
    public T peek(){ // peek method returns the data value of the bottom element
        return (T)bottom.getData();
    }
    public int getSize(){ // returns the size
        return size;
    }

    public boolean isEmpty(){ // is empty
        return size == 0;
    }




}
