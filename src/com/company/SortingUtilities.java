package com.company;
public class SortingUtilities
    {
        public int[] randomIntArr(int count)
        {
            int[]arr = new int[count];
            for (int i = 0; i < count; i++)
            {
                arr[i] = (int) Math.random()*1001;
            }

            return arr;
        }

        public String[] randomStringArr(int num, int length)
        {
            String[] arr = new String [num];
            while (num > 0)
            {
                int i = 0;
                String s = "";
                while (i<length) {
                    char c = (char) (Math.random() * 26 + 97);
                    s = s + c;
                    i++;
                }
                num--;
                arr[num] = s;
            }
            return arr;
        }

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

       public static int[] copyIntArray(int[] arr)
       {
           int[] newArray = new int[arr.length];
           for (int i = 0; i<arr.length; i++)
           {
               newArray[i] = arr[i];
           }
           return newArray;
       }


    }
