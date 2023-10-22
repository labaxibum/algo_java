package org.helper;

import java.util.ArrayList;
import java.util.LinkedList;

public class compareList {

    public void compare2ListTypes() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapseTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }


        startTime = System.nanoTime();
        linkedList.remove(999999);
        endTime = System.nanoTime();
        elapseTime = endTime - startTime;
        System.out.println("Linked list: " + elapseTime + " ns");

        startTime = System.nanoTime();
        arrayList.remove(999999);
        endTime = System.nanoTime();
        elapseTime = endTime - startTime;
        System.out.println("Array list: " + elapseTime + " ns");
    }

}
