package edu.cis.wordstack;

import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Random;

import edu.cis.wordstack.Model.Stack.CISStack;

import static org.junit.Assert.*;

public class StaticStackTest
{
    @Test
    public void pushOnce()
    {
        CISStack<Integer> stack = new CISStack<>();
        assertEquals(1, (int) stack.push(1));
    }

    @Test
    public void pushRandom()
    {
        int pushAmount = new Random().nextInt(100) + 1;
        CISStack<Integer> stack = new CISStack<>(pushAmount + 1);
        System.out.println("pushRandom pushAmount: " + pushAmount);
        for(int i = 0; i < pushAmount; i++)
        {
            stack.push(new Random().nextInt(100) + 1);
        }
        int expected = new Random().nextInt(100) + 1;
        assertEquals(expected, (int) stack.push(expected));
    }

    @Test(expected = NoSuchElementException.class)
    public void popException()
    {
        int pushAmount = new Random().nextInt(100) + 1;
        CISStack<Integer> stack = new CISStack<>(pushAmount);
        for(int i = 0; i < pushAmount; i++)
        {
            stack.push(i);
        }
        for(int i = 0; i <= pushAmount; i++)
        {
            stack.pop();
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void simpleFull()
    {
        CISStack<String> stack = new CISStack<>();
        for(int i = 0; i < 11; i++)
        {
            stack.push("a");
        }
    }

    @Test
    public void popOnce()
    {
        CISStack<Integer> stack = new CISStack<>();
        stack.push(1);
        assertEquals(1, (int) stack.pop());
    }

    @Test
    public void popFirst()
    {
        int pushAmount = new Random().nextInt(100) + 2;
        CISStack<Integer> stack = new CISStack<>(pushAmount + 1);
        System.out.println("popFirst pushAmount: " + pushAmount);
        int firstIn =  new Random().nextInt(1000) + 100;
        stack.push(firstIn);
        for(int i = 0; i < pushAmount; i++)
        {
            stack.push(new Random().nextInt(100) + 1);
        }
        for(int i = 0; i < pushAmount; i++)
        {
            stack.pop();
        }
        int actualVal = stack.pop();
        assertEquals(firstIn, actualVal);
        System.out.println("expected: " + firstIn);
        System.out.println("actual: " + actualVal);
        System.out.flush();
    }

    @Test
    public void popRandom()
    {
        int pushAmount = new Random().nextInt(100) + 2;
        CISStack<Integer> stack = new CISStack<>(pushAmount);
        System.out.println("popRandom pushAmount: " + pushAmount);
        int nextPop = new Random().nextInt(pushAmount - 1) + 1;
        System.out.println("popRandom nextPop: " + nextPop);
        int nextIn = new Random().nextInt(100) + 100;
        for(int i = 0; i < pushAmount; i++)
        {
            if(i == nextPop)
            {
                stack.push(nextIn);
            }
            stack.push(new Random().nextInt(100) + 1);
        }
        for(int i = nextPop; i < pushAmount; i++)
        {
            stack.pop();
        }
        int actualVal = stack.pop();
        assertEquals(nextIn, actualVal);
        System.out.println("expected: " + nextIn);
        System.out.println("actual: " + actualVal);
        System.out.flush();
    }

    @Test
    public void peek()
    {
        int pushAmount = new Random().nextInt(100) + 2;
        CISStack<Integer> stack = new CISStack<>(pushAmount + 1);
        System.out.println("peek pushAmount: " + pushAmount);
        for(int i = 0; i < pushAmount; i++)
        {
            stack.push(new Random().nextInt(100) + 1);
        }
        int expected = new Random().nextInt(1000) + 1;
        stack.push(expected);
        int actual = stack.peek();
        assertEquals(expected, actual);
    }

    @Test
    public void empty()
    {
        CISStack<Integer> stack = new CISStack<>();
        assertTrue(stack.isEmpty());
        for(int i = 0; i < 9; i++)
        {
            stack.push(i);
        }
        assertFalse(stack.isEmpty());
    }

    @Test
    public void size()
    {
        int pushAmount = new Random().nextInt(100) + 1;
        CISStack<Integer> stack = new CISStack<>(pushAmount + 1);
        assertEquals(0, stack.size());
        for(int i = 0; i < pushAmount; i++)
        {
            stack.push(i);
        }
        System.out.println("expected size: " + pushAmount);
        assertEquals(pushAmount, stack.size());
    }
}
