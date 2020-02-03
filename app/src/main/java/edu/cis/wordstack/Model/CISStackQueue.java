package edu.cis.wordstack.Model;

import edu.cis.wordstack.Model.CISStack;

public class CISStackQueue<T>
{
    private CISStack<T> stack1;    // back of queue
    private CISStack<T> stack2;    // front of queue

    public CISStackQueue()
    {
        stack1 = new CISStack<>();
        stack2 = new CISStack<>();
    }

    /**
     * Returns size of this queue.
     *
     * @return size as int
     */
    public int size() {
        return -1;
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

    /* Enqueue
     *
     * Adds the item to this queue to preserve FIFO order.
     * CAN behave like circular queue or linear queue.
     *
     * @param  item the item to add
     */
    public void enqueue(T item)
    {

    }

    /* Dequeue
     *
     * Removes and returns the item on this queue that was LEAST recently added.
     *
     * @return the item on this queue that was LEAST recently added
     * @throws NoSuchElementException if this queue is empty
     */
    public T dequeue()
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
}
