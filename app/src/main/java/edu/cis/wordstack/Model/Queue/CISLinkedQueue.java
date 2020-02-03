package edu.cis.wordstack.Model.Queue;


/*
 * A DYNAMIC Implementation of a Queue using nodes.
 */

public class CISLinkedQueue<T>
{
    private Node<T> first;    // beginning of queue
    private Node<T> last;     // end of queue
    private int n;               // number of elements on queue

    private static class Node<T>
    {
        private T item;
        private Node<T> next;
    }

    /*
     * Constructor should initialize instance variables to appropriate values.
     */
    public CISLinkedQueue() {

    }

    /* Enqueue
     *
     * Adds the item to this queue to preserve FIFO order.
     *
     * @param  item the item to add
     */
    public void enqueue(T item)
    {

    }

    /* Dequeue
     *
     * Removes and returns the item on this queue that was least recently added.
     *
     * @return the item on this queue that was least recently added
     * @throws NoSuchElementException if this queue is empty
     */
    public T dequeue()
    {
        return null;
    }

    /* Peek
     *
     * Returns the item LEAST recently added to this queue.
     *
     * @throws NoSuchElementException if this queue is empty
     * @return item LEAST recently added, without removing it
     */

    public T peek()
    {
        return null;
    }

    /**
     * Returns true if this queue is empty.
     *
     * @return true if this queue is empty; false otherwise
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * Returns size of this queue.
     *
     * @return size as int
     */
    public int size() {
        return -1;
    }
}
