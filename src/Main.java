/**
 * Main.java
 * Authors: Luke O’Drobinak
 * Date: 11/14/2023
 * Collaborators:
 * Citations: Google, Stack Overflow
 **/
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);

        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.getSize());
        queue.enqueue(12);
        System.out.println(queue.getSize());

        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}