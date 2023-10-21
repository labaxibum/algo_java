package org.helper;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class itemsQueue {
    public void queue() {
        Queue<String> queueItems = new LinkedList<>();
        queueItems.offer("Item 1");
        queueItems.offer("Item 2");
        queueItems.offer("Item 3");
        queueItems.offer("Item 4");
        queueItems.offer("Item 5");
        System.out.println("The first version of Queue: " + queueItems);
        System.out.println("The size of the Queue: " + queueItems.size());
        System.out.println("Item after using Poll: " + queueItems.poll());
        System.out.println("Queue after Poll: " + queueItems);
        System.out.println("Items after using Peek: " + queueItems.peek());
        System.out.println("Queue after Peek: " + queueItems);
        System.out.println("Return after checking contains: " + queueItems.contains("Item 2"));
        System.out.println("Remaining items left in the Queue: " + queueItems);
    }

    public void queueWithPrior() {
        Queue<String> queueItems = new PriorityQueue<>(Collections.reverseOrder());
        queueItems.offer("Item 3");
        queueItems.offer("Item 4");
        queueItems.offer("Item 1");
        queueItems.offer("Item 2");
        queueItems.offer("Item 5");
        System.out.println("Normal Queue: [Item 3, Item 4, Item 1, Item 2, Item 5]");
        System.out.println("Priority Queue: " + queueItems);
        System.out.println("The size of the Queue: " + queueItems.size());
        System.out.println("Item after using Poll: " + queueItems.poll());
        System.out.println("Queue after Poll: " + queueItems);
        System.out.println("Items after using Peek: " + queueItems.peek());
        System.out.println("Queue after Peek: " + queueItems);
        System.out.println("Return after checking contains: " + queueItems.contains("Item 2"));
        System.out.println("Remaining items left in the Queue: " + queueItems);
    }
}