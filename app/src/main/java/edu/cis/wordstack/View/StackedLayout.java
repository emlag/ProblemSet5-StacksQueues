package edu.cis.wordstack.View;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Stack;

import edu.cis.wordstack.Model.CISStack;

public class StackedLayout extends LinearLayout {

    private CISStack<View> tiles = new CISStack<>();

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
        return tiles.empty();
    }

    public void clear() {
        /**
         **
         **  YOUR CODE GOES HERE
         **
         **/
    }
}
