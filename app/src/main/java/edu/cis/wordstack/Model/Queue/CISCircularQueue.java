package edu.cis.wordstack.Model.Queue;

/*
 * A STATIC implementation of a Queue that uses
 * a circular algorithm.
 */

public class CISCircularQueue<T>
{
    T[] innerArr;

    /*
     * Empty constructor, default size must be 10
     * You must use an ARRAY to implement this Queue
     * Initialize any instance variables that are appropriate
     */
    public CISCircularQueue()
    {
        innerArr = (T[]) new Object[10];
    }


    /*
     * One arg constructor
     * You must use an ARRAY to implement this Queue
     * Initialize any instance variables that are appropriate
     *
     * @param desired capacity for the queue
     */
    public CISCircularQueue(int capacity)
    {

    }

    /* Enqueue
     *
     * Adds the item to this queue to preserve FIFO order.
     * MUST behave like a circular queue
     *
     * @param  item the item to add
     * @throws NoSuchElementException if this queue is full
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
     * @return item LEAST recently added, without removing it
     * @throws NoSuchElementException if this queue is empty
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
