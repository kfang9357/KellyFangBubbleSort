package com.company;
import static com.company.SortingUtilities.isSorted;
import static com.company.SortingUtilities.swap;

public class BubbleSort {
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

    //int [] testArr = {8,6,7,5,3,0,9,10,1,2,3};


}
