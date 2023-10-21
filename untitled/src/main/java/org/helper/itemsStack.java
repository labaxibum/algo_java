package org.helper;

import java.util.Stack;

public class itemsStack {
    public void stackSet() {
        Stack<String> stackItems = new Stack<>();
        stackItems.push("item 1");
        stackItems.push("item 2");
        stackItems.push("item 3");
        stackItems.push("item 4");
        stackItems.push("item 5");
        System.out.println("First version of Stack: " + stackItems);
        System.out.println("The size of the Stack: " + stackItems.size());
        System.out.println("Item after using Pop " + stackItems.pop());
        System.out.println("Stack after Pop:" + stackItems);
        System.out.println("Item after using Peek " + stackItems.peek());
        System.out.println("Stack after Peek: " + stackItems);
        System.out.println("The position of the item in the stack: " + stackItems.search("item 2"));
        System.out.println("Remaining items left in the stack: " + stackItems);
    }
}