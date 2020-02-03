package edu.cis.wordstack.Model.Queue;

import edu.cis.wordstack.Model.Stack.CISLinkedStack;

/*
 * A DYNAMIC implementation of a Queue using
 * dynamic stacks.
 */

public class CISStackQueue<T>
{
    private CISLinkedStack<T> stack1;    // back of queue
    private CISLinkedStack<T> stack2;    // front of queue

    public CISStackQueue()
    {
        stack1 = new CISLinkedStack<>();
        stack2 = new CISLinkedStack<>();
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
     * Removes and returns the item on this queue that was LEAST recently added.
     *
     * @return the item on this queue that was LEAST recently added
     * @throws NoSuchElementException if this queue is empty
     */
    public T dequeue()
    {
        return null;
    }

    /* Peek
     *
     * Returns the item LEAST recently added to this queue, does not remove it.
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
     * Returns number of items being held by this queue
     *
     * @return size as int
     */
    public int size() {
        return -1;
    }
}
