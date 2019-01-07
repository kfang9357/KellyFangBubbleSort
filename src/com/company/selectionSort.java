package com.company;

public class selectionSort {

    public static void selectionSort(int[]arr) {
        int len = arr.length;
        int min = 0;

        for (int b = 0; b < arr.length; b++)
        {
            for (int a = 0; a<arr.length-1; a++)
                {
                    int check1 = arr[a];
                    int check2 = arr [a+1];

                    if (check1>check2)
                    {
                        min = check2;
                    }
                    else
                {
                    min = check1;
                }
            }
            arr[b] = min;
        }
    }

}
