package com.company;

public class Runner {

    public static void main(String[] args) {
	    int [] testArr = {8,6,7,5,3,0,9,10,1,2,3};

	    System.out.print("Before: ");
	    for  (int num:testArr)
        {System.out.print(num+" ");}
	    System.out.println();

	    long time = System.nanoTime();
	    InPlaceSorts.bubbleSort(testArr);
	    time = System.nanoTime() - time;

	    System.out.print("After: ");
	    for (int num:testArr) {
            System.out.print(num + " ");
        }
        System.out.println();

	    System.out.println("Time taken: "+time+" nanoseconds");

	    /****************************************************/

        int [] testArr2 = {7,5,3,5,2,4,2,1,3,4,4};

        System.out.print("Before: ");
        for  (int num:testArr2)
        {System.out.print(num+" ");}
        System.out.println();


        InPlaceSorts.selectionSort(testArr2);


        System.out.print("After: ");
        for (int num:testArr2) {
            System.out.print(num + " ");
        }
        System.out.println();


        /*****************************************************/

        int [] testArr3 = {9,4,6,3,2,7,5,4,2,7,31,9};

        System.out.print("Before: ");
        for  (int num:testArr3)
        {System.out.print(num+" ");}
        System.out.println();


        InPlaceSorts.insertionSort(testArr3);


        System.out.print("After: ");
        for (int num:testArr3) {
            System.out.print(num + " ");
        }
        System.out.println();

        }

    }
