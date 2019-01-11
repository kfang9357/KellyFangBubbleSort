package com.company;

public class Runner {

    public static void main(String[] args) {
        String[] testArr ={"this","is","a","test","array"};

	    System.out.print("Before: ");
	    for  (String str:testArr)
        {System.out.print(str+" ");}
	    System.out.println();

	    long time = System.nanoTime();
	    InPlaceSorts.bubbleSort(testArr);
	    time = System.nanoTime() - time;

	    System.out.print("After: ");
	    for (String str:testArr) {
            System.out.print(str + " ");
        }
        System.out.println();

	    System.out.println("Time taken: "+time+" nanoseconds");

	    System.out.println("");

	    /****************************************************/

        double [] testArr2 = {7.2,5.1,3.4,5.7,2.2,4.5,2.1,1.9,3.1,4.6,4.8};

        System.out.print("Before: ");
        for  (double num:testArr2)
        {System.out.print(num+" ");}
        System.out.println();

        long time2 = System.nanoTime();
        InPlaceSorts.selectionSort(testArr2);
        time2 = System.nanoTime() - time2;

        System.out.print("After: ");
        for (double num:testArr2) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Time taken: "+time2+" nanoseconds");
        System.out.println("");
        /*****************************************************/

        int [] testArr3 = {9,4,6,3,2,7,5,4,2,7,31,9};
        System.out.print("Before: ");
        for  (int num:testArr3)
        {System.out.print(num+" ");}
        System.out.println();

        long time3 = System.nanoTime();
        InPlaceSorts.insertionSort(testArr3);
        time3 = System.nanoTime() - time3;

        System.out.print("After: ");
        for (int num:testArr3) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Time taken: "+time3+" nanoseconds");
        }

    }
