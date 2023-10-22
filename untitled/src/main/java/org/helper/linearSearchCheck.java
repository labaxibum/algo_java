package org.helper;

public class linearSearchCheck {
    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void doLinearSearch() {
        int[] array = {9, 123, 122, 0, 1, 4, 5, 7};

        int index = linearSearch(array, 124);
        if (index != -1) {
            System.out.println("Found element at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
