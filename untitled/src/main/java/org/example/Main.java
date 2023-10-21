package org.example;

import org.helper.itemsQueue;
import org.helper.itemsStack;

public class Main {
    public static void main(String[] args) {
        System.out.println("**************************STACK REGION**************************");
        itemsStack itemsStack = new itemsStack();
        itemsStack.stackSet();
        System.out.println("**************************END REGION**************************\n");
        System.out.println("**************************QUEUE REGION**************************");
        itemsQueue itemsQueue = new itemsQueue();
        itemsQueue.queue();
        System.out.println("**************************PRIORITY QUEUE**************************");
        itemsQueue.queueWithPrior();
        System.out.println("**************************END REGION**************************\n");
    }
}
