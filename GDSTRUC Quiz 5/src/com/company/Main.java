package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int numbers[] = {12, 32, 64, 78, 89, 91, 102, 123, 152, 162, 180, 216, 230, 256, 280, 301, 321, 345, 421};

        System.out.println(pickySearch(numbers, 162)); // Look for value 162 (found at index 9)
        System.out.println(pickySearch(numbers, 420)); // Look for value 420 (no value in array)
    }

    public static int pickySearch(int[] input, int value) {
        // Picky Search
        // Data must be sorted
        // Picks a random index in the available array
        // Check if array value is equal to value, if so return index if not
        // Check if value is less than value, if so limit the search to indexes less than the current index if not
        // Check if value is more than value, if so limit the search to indexes more than the current index
        // Repeat until value is found, if not return -1
        Random rand = new Random();
        int start = 0;
        int index;
        int end = input.length - 1;

        while (start <= end) {
            if (start != end) {
                index = rand.nextInt(end - start) + start;
            } else {
                index = start;
            }

            if (input[index] == value) {
                return index;
            } else if (value < input[index]) {
                end = index - 1;
            } else if (value > input[index]) {
                start = index + 1;
            }
        }

        return -1;
    }
}
