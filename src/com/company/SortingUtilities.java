package com.company;
public class SortingUtilities
    {

        public static void swap (int[]arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static boolean isSorted(int[] arr)
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
    }
}
