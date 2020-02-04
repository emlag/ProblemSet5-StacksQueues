package edu.cis.wordstack.Model.Stack;

/*
 * A DYNAMIC implementation of a stack.
 */

public class CISLinkedStack<T>
{
    private Node<T> first;
    private int n;

    /*
     * Empty constructor
     * You must use nodes to implement this Stack
     * Initialize any instance variables that are appropriate
     */
    private static class Node<T> {
        private T item;
        private Node<T> next;
    }

    public CISLinkedStack()
    {

    }

    /* Push
     *
     * Adds the item to this stack to preserve LIFO order.
     *
     * @param  item the item to add
     * @return return the item added
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
     * @throws NoSuchElementException if this stack is empty
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
     * @throws NoSuchElementException if this stack is empty
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
     * Returns the amount of object being held by the stack.
     *
     * @return size as int
     */
    public int size() {
        return -1;
    }
}
