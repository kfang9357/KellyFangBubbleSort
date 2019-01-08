package com.company;
import static com.company.SortingUtilities.swap;

public class selectionSort {

    public static void selectionSort(int[]arr) {
     for(int index = 0; index < arr.length; index++)
     {
        minimum(arr, index);
     }
    }


    public static int minimum(int arr[], int ind) {
        int minInd = ind;
        for (int i = ind; i < arr.length; i++) {
            if (arr[i] < arr[minInd]) {
                swap(arr,arr[i], arr[minInd]);
                minInd = i;
            }
        }
        return minInd;
    }

}
