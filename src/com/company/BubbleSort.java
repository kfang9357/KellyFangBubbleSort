package com.company;


public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        int len = arr.length;

        while (checkList(arr) )
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
                return true;
            }
        }
        return false;
    }


    //int [] testArr = {8,6,7,5,3,0,9,10,1,2,3};


}
