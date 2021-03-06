package edu.cis.wordstack;

import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Random;

import edu.cis.wordstack.Model.Queue.CISStackQueue;

import static org.junit.Assert.*;

public class StackQueueTest
{
    @Test
    public void size()
    {
        int expectedSize = new Random().nextInt(100) + 1;
        CISStackQueue<String> queue = new CISStackQueue<>();
        for(int i = 0; i < expectedSize; i++)
        {
            queue.enqueue("a");
        }
        assertEquals(expectedSize, queue.size());
        System.out.println("expected size: " + expectedSize);
        System.out.println("actual size: " + queue.size());
        System.out.flush();
    }

    @Test(expected = NoSuchElementException.class)
    public void peekException()
    {
        CISStackQueue<String> queue = new CISStackQueue<>();
        queue.peek();
    }

    @Test
    public void peek()
    {
        CISStackQueue<String> queue = new CISStackQueue<>();
        queue.enqueue("hi");
        int enqueueAmount = new Random().nextInt(50) + 1;
        for(int i = 0; i < enqueueAmount; i++)
        {
            queue.enqueue("a");
        }
        assertEquals("hi", queue.peek());
        System.out.println("correct peek value");
        System.out.flush();
    }

    @Test
    public void peekOnce()
    {
        CISStackQueue<String> queue = new CISStackQueue<>();
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        queue.size();
        queue.peek();
        assertEquals("first", queue.peek());
    }

    @Test
    public void enqueue()
    {
        CISStackQueue<Character> queue = new CISStackQueue<>();
        char firstChar = (char) (new Random().nextInt(26) + 'a');
        queue.enqueue(firstChar);
        int enqueueAmount = new Random().nextInt(100) + 1;
        for(int i = 0; i < enqueueAmount; i++)
        {
            char randomChar = (char) (new Random().nextInt(26) + 'a');
            queue.enqueue(randomChar);
        }
        assertEquals(firstChar, (char) queue.peek());
        System.out.println("expected char: " + firstChar);
        System.out.println("actual char: " + queue.peek());
        assertEquals(enqueueAmount + 1, queue.size());
        System.out.println("correct enqueue size");
        System.out.flush();
    }

    @Test(expected = NoSuchElementException.class)
    public void dequeueException()
    {
        CISStackQueue<Integer> queue = new CISStackQueue<>();
        int enqueueAmount = new Random().nextInt(100) + 1;
        for(int i = 0; i < enqueueAmount; i++)
        {
            queue.enqueue(i);
        }
        for(int i = 0; i <= enqueueAmount; i++)
        {
            queue.dequeue();
        }
    }

    @Test
    public void dequeueOnce()
    {
        CISStackQueue<Integer> queue = new CISStackQueue<>();
        int enqueueAmount = new Random().nextInt(100) + 1;
        int expected = new Random().nextInt(1000) + 1;
        queue.enqueue(expected);
        for(int i = 0; i < enqueueAmount; i++)
        {
            queue.enqueue(new Random().nextInt(100) + 1);
        }
        int actualVal = queue.dequeue();
        assertEquals(expected, actualVal);
        System.out.println("expected: " + expected);
        System.out.println("actual: " + actualVal);
    }

    @Test
    public void dequeueRandomValue()
    {
        CISStackQueue<Character> queue = new CISStackQueue<>();
        int enqueueAmount = new Random().nextInt(100) + 2;
        int nextDequeue = new Random().nextInt(enqueueAmount - 1) + 1;
        System.out.println("dequeueValue enqueueAmount: " + enqueueAmount);
        System.out.println("dequeueValue nextDequeue: " + nextDequeue);
        char firstChar = (char) (new Random().nextInt(26) + 'a');
        char nextChar = (char) (new Random().nextInt(26) + 'A');
        for(int i = 0; i < enqueueAmount; i++)
        {
            if(i == 0)
            {
                queue.enqueue(firstChar);
            }
            else if(i == nextDequeue)
            {
                queue.enqueue(nextChar);
            }
            char randomChar = (char) (new Random().nextInt(26) + 'a');
            queue.enqueue(randomChar);
        }
        char actualVal = queue.dequeue();
        assertEquals(firstChar, actualVal);
        System.out.println("expected: " + firstChar);
        System.out.println("actual: " + actualVal);
        for(int i = 0; i < nextDequeue; i++)
        {
            queue.dequeue();
        }
        actualVal = queue.dequeue();
        assertEquals(nextChar, actualVal);
        System.out.println("expected: " + nextChar);
        System.out.println("actual: " + actualVal);

        System.out.flush();
    }

    @Test
    public void isEmpty()
    {
        CISStackQueue<Integer> queue = new CISStackQueue<>();
        int enqueueAmount = new Random().nextInt(100) + 1;
        System.out.println("isEmpty enqueueAmount: " + enqueueAmount);
        for(int i = 0; i < enqueueAmount; i++)
        {
            queue.enqueue(i);
        }
        assertFalse(queue.isEmpty());
        System.out.println("is not empty");
        System.out.flush();
        for(int i = 0; i < enqueueAmount; i++)
        {
            queue.dequeue();
        }
        assertTrue(queue.isEmpty());
        System.out.println("is empty");
        System.out.flush();
    }
}