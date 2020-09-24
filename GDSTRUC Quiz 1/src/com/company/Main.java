package com.company;

public class Main {

    public static void main(String[] args)
    {

        int[] numbers = new int[10];

        numbers[0] = 9235;
        numbers[1] = 4219;
        numbers[2] = 1299;
        numbers[3] = 153;
        numbers[4] = 4091;
        numbers[5] = 24;
        numbers[6] = 1234;
        numbers[7] = 754;
        numbers[8] = 1364;
        numbers[9] = 134;

        System.out.println("Before sorting:");
        printArray(numbers);

        System.out.println("\n\n After sorting:");
        modifiedBubbleSort(numbers);
        printArray(numbers);

    }

    private static void modifiedBubbleSort(int[] array)
    {
        for (int lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                // Change greater than to less than so that lower numbers bubble up.
                if (array[i] < array[i + 1])
                {
                    // Swap next number with current number
                    int temporary = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temporary;
                }
            }
        }
    }

    private static void modifiedSelectionSort(int[] array)
    {
        for (int lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {

            // Keep track of the index of the smallest number
            int smallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                // Change greater than to less than so the smallest number gets found.
                if (array[i] < array[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            // Swap number at last index with the smallest number
            int temporary = array[lastSortedIndex];
            array[lastSortedIndex] = array[smallestIndex];
            array[smallestIndex] = temporary;

        }
    }

    private static void printArray(int[] array)
    {

        for (int i : array)
        {
            System.out.print(i + " ");
        }

    }
}
