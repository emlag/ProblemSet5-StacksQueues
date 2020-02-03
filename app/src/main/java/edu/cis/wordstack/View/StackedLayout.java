package edu.cis.wordstack.View;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import edu.cis.wordstack.Model.Stack.CISLinkedStack;
import edu.cis.wordstack.Model.Stack.CISStack;

public class StackedLayout extends LinearLayout {

    private CISLinkedStack<View> tiles = new CISLinkedStack<>();

    public StackedLayout(Context context) {
        super(context);
    }

    public void push(View tile) {
        /**
         **
         **  YOUR CODE GOES HERE
         **
         **/
    }

    public View pop() {
        View popped = null;
        /**
         **
         **  YOUR CODE GOES HERE
         **
         **/
        return popped;
    }

    public View peek() {
        return tiles.peek();
    }

    public boolean empty() {
        return tiles.isEmpty();
    }

    public void clear() {
        /**
         **
         **  YOUR CODE GOES HERE
         **
         **/
    }
}
