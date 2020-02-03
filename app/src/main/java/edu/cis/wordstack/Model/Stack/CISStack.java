package edu.cis.wordstack.Model.Stack;


/*
 * A STATIC implementation of a stack
 */
public class CISStack<T>
{
    T[] innerArr;

    /*
     * Empty constructor, default size must be 10
     * You must use an ARRAY to implement this Stack
     * Initialize any instance variables that are appropriate
     */
    public CISStack()
    {
        innerArr = (T[]) new Object[10];
    }

    /*
     * One arg constructor
     * You must use an ARRAY to implement this Stack
     * Initialize any instance variables that are appropriate
     *
     * @param desired capacity for the stack
     */
    public CISStack(int capacity)
    {

    }


    /* Push
     *
     * Adds the item to this stack to preserve LIFO order.
     *
     * @param  item the item to add
     * @return return the item added
     * @throws NoSuchElementException if this queue is full
     */
    public T push(T item)
    {
        return null;
    }

    /* Pop
     *
     * Remove the next item this stack to preserve LIFO order.
     *
     * @return the next item in the stack
     * @throws NoSuchElementException if this queue is empty
     */
    public T pop()
    {
        return null;
    }

    /* Peek
     *
     * Return the next item this stack to preserve LIFO order, do not remove
     *
     * @return the next item in the stack
     * @throws NoSuchElementException if this queue is empty
     */
    public T peek()
    {
        return null;
    }

    /**
     * Returns true if this stack is empty.
     *
     * @return true if this stack is empty; false otherwise
     */
    public boolean isEmpty()
    {
        return false;
    }

    /**
     * Returns true if this stack is full.
     *
     * @return true if this stack is full; false otherwise
     */
    public boolean isFull()
    {
        return false;
    }

    /**
     * Returns the amount of object being held by the stack.
     *
     * @return size as int
     */
    public int size() {
        return -1;
    }
}
