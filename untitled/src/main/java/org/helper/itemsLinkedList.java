package org.helper;

import java.util.LinkedList;

public class itemsLinkedList {
    public void linkedListSet() {
        LinkedList<String> itemsLinkedListStack = new LinkedList<>();
        System.out.println("Linked list as a Stack");
        itemsLinkedListStack.push("Item 1");
        itemsLinkedListStack.push("Item 2");
        itemsLinkedListStack.push("Item 3");
        itemsLinkedListStack.push("Item 4");
        itemsLinkedListStack.push("Item 5");
        System.out.println("Linked List Stack after Push: " + itemsLinkedListStack);
        itemsLinkedListStack.pop();
        System.out.println("Linked list as a Stack after Pop: " + itemsLinkedListStack);

        LinkedList<String> itemsLinkedListQueue = new LinkedList<>();
        System.out.println("Linked list as a Queue");
        itemsLinkedListQueue.offer("Item 1");
        itemsLinkedListQueue.offer("Item 2");
        itemsLinkedListQueue.offer("Item 3");
        itemsLinkedListQueue.offer("Item 4");
        itemsLinkedListQueue.offer("Item 5");
        System.out.println("Linked List Queue after Offer: " + itemsLinkedListQueue);
        itemsLinkedListQueue.poll();
        System.out.println("Linked list as a Queue after Poll: " + itemsLinkedListQueue);
        itemsLinkedListQueue.add(2, "Item 6");
        System.out.println("Linked list after adding index is 2 and item is Item 6: " + itemsLinkedListQueue);
        itemsLinkedListQueue.remove("Item 4");
        System.out.println("Linked list after removing Item 4: " + itemsLinkedListQueue);


    }
}
