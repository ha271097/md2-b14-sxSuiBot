package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array [] = { 2,6,2,9,4,7,8,3,89,5};
        bubbleSort(array);
        for (int a: array
             ) {
            System.out.println(a);
        }

    }
    public static void bubbleSort(int [] array){
        boolean nextPass = true;
        for (int i = 1; i < array.length && nextPass; i++) {
            nextPass = false;
            for (int j = 0; j < array.length - i ; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    nextPass = true;
                }
            }
        }
    }
}
