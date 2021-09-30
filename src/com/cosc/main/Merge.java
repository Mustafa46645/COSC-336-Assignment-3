package com.cosc.main;

public class Merge
{
    // 7, 3, 8, 1, 5
    private static int[] unsorted, left, right;
    private static int pairCount = 0;

    public static void main(String[] args)
    {
        unsorted = new int[] {7, 3, 8, 1, 5};

        execute();
    }

    private static void execute()
    {
        int[] left = split(unsorted, 'L');
        int[] right = split(unsorted, 'R');

        System.out.println("L: ");
        for (int value : left) System.out.print(value + ", ");

        System.out.println("\nR: ");
        for (int value : right) System.out.print(value + ", ");

        System.out.println("\nUnsorted: ");
        for (int value : unsorted) System.out.print(value + ", ");

        // TODO: The recursive sorting of each side

        //System.out.println("\nPair Count: " + pairCount);
    }

    private static int[] split(int[] arr, char side)
    {
        int upper = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (i >= arr.length / 2)
                upper++;
        }

        left = new int[arr.length / 2];
        right = new int[upper];

        int j = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (i >= arr.length / 2)
            {
                right[j] = arr[i];
                j++;
            }
            else
                left[i] = arr[i];
        }

        if (side == 'L')
            return left;
        else
            return right;
    }

    private static int[] swap(int[] array)
    {
        int holder;
        if (array[0] > array[1])
        {
            pairCount++;

            holder = array[0];
            array[0] = array[1];
            array[1] = holder;
        }

        return array;
    }
}
