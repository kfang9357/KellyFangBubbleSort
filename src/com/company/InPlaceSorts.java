package com.company;

import static com.company.SortingUtilities.*;

public class InPlaceSorts {
    public static void bubbleSort(String [] stringArr)
    {
        int len = stringArr.length;

        while (isUnsorted(stringArr) )
        {
            for (int i = 0; i < len - 1; i++)
            {
                if ((stringArr[i].compareTo(stringArr[i+1]))>0)
                {
                    swap2(stringArr,i,i+1);
                }

            }
        }
    }

    public static void selectionSort(double[]arr) {
        for(int index = 0; index < arr.length; index++)
           minimumIndex(arr, index);
        }

    public static int minimumIndex(double arr[], int ind)
    {
        int minInd = ind;
        for (int i = ind + 1; i <arr.length; i++)
        {
            if (arr[i] < arr[minInd])
            {
                swap3(arr,i,minInd);
            }
        }
        return minInd;
    }

    public static void insertionSort(int[]arr){
        for (int index = 0; index < arr.length ; index ++)
        {
            for (int j = index; j > 0; j-- )
            {
                if (arr[j]<arr[j-1])
                {
                    swap(arr, j,j-1);
                }
            }
        }

    }

}


