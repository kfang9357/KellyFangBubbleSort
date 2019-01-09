package com.company;
import static com.company.SortingUtilities.isSorted;
import static com.company.SortingUtilities.swap;

public class InPlaceSorts {
    public static void bubbleSort(int[] arr)
    {
        int len = arr.length;

        while (isSorted(arr) )
        {
            for (int i = 0; i < len - 1; i++)
            {
                if (arr[i]> arr[i+1])
                {
                    swap(arr, i+0, i+1);
                }
            }
        }
    }
        public static void selectionSort(int[]arr) {
        for(int index = 0; index < arr.length; index++)
            {
                int minInd = arr[index];
                for (int i = index + 1; i <arr.length; i++)
                {
                    if (arr[i] < minInd)
                    {
                        swap(arr,arr[i],arr[index]);
                    }
                }
            }
        }

/**
    public static void minimum(int arr[], int ind)
    {

    }
**/


}


