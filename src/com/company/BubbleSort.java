package com.company;


public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        while (checkList(arr) )
        {

        }
    }



    public static void swap (int[]arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean checkList (int[] arr)
    {
        int len = arr.length - 1;
        for (int pos = 0; pos < len; pos++)
        {
            if (arr[pos]>arr[pos+1])
            {
                return false;
            }
        }
        return true;
    }


    //int [] testArr = {8,6,7,5,3,0,9,10,1,2,3};


}
