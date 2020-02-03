package edu.cis.wordstack;

import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Random;

import edu.cis.wordstack.Model.Queue.CISLinkedQueue;

import static org.junit.Assert.*;

public class LinkedQueueTest
{

    @Test
    public void simpleSize()
    {
        CISLinkedQueue<Integer> testQueue = new CISLinkedQueue<Integer>();

        assertEquals(0, testQueue.size());
        testQueue.enqueue(5);
        testQueue.enqueue(10);
        testQueue.enqueue(11);
        testQueue.enqueue(5);
        assertEquals(4, testQueue.size());
        testQueue.enqueue(1);
        testQueue.enqueue(0);
        assertEquals(6, testQueue.size());

        for (int i = 0; i < 100; i++)
        {
            testQueue.enqueue(i);
        }
        assertEquals(106, testQueue.size());
        System.out.println("hi");
    }

    @Test
    public void simplePeek()
    {
        CISLinkedQueue<String> testStringQueue = new CISLinkedQueue<String>();

        testStringQueue.enqueue("Ed");
        assertEquals("Ed", testStringQueue.peek());

        testStringQueue.enqueue("Nitu");
        testStringQueue.enqueue("Sanaz");

        assertEquals("Ed", testStringQueue.peek());


        for (int i = 0; i < 100; i++)
        {
            testStringQueue.enqueue("Student ID: " + i);
        }
        assertEquals("Ed", testStringQueue.peek());
        System.out.println("hi2");
    }

    @Test
    public void size()
    {
        int expectedSize = new Random().nextInt(100) + 1;
        CISLinkedQueue<String> queue = new CISLinkedQueue<>();
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
        CISLinkedQueue<String> queue = new CISLinkedQueue<>();
        queue.peek();
    }

    @Test
    public void peek()
    {
        CISLinkedQueue<String> queue = new CISLinkedQueue<>();
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
    public void enqueue()
    {
        CISLinkedQueue<Character> queue = new CISLinkedQueue<>();
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
        CISLinkedQueue<Integer> queue = new CISLinkedQueue<>();
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
        CISLinkedQueue<Integer> queue = new CISLinkedQueue<>();
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
        CISLinkedQueue<Character> queue = new CISLinkedQueue<>();
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
        CISLinkedQueue<Integer> queue = new CISLinkedQueue<>();
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