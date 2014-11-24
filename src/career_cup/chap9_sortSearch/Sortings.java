/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CareerCup.Chap9_SortSearch;

/**
 *
 * @author huijun
 */
public class Sortings {

    //bubble sort
    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    //selection sort
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(array, i, min);
            }
        }
    }

    //Merge sort
    public static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    private static void merge(int[] array, int start, int middle, int end) {
        int lengthLeft = middle - start + 1;
        int lengthRight = end - middle;
        int[] arrayLeft = new int[lengthLeft];
        int[] arrayRight = new int[lengthRight];
        int i, j, p;        

        for (i = 0; i < lengthLeft; i++) {
            arrayLeft[i] = array[start + i];
        }

        for (j = 0; j < lengthRight; j++) {
            arrayRight[j] = array[middle + j + 1];
        }

        for (p = start, i = 0, j = 0; p <= end; p++) {
            if (i < lengthLeft && j < lengthRight) {
                if (arrayLeft[i] <= arrayRight[j]) {
                    array[p] = arrayLeft[i++];

                } else {
                    array[p] = arrayRight[j++];

                }
            } else if (i == lengthLeft && j < lengthRight) {
                array[p] = arrayRight[j++];
            } else if (j == lengthRight && i < lengthLeft) {
                array[p] = arrayLeft[i++];
            }
        }
    }
    
    //quick sort
    public static void quickSort(int[] array, int start, int end){
        if(start < end){
            if(end - start < 1) return;
            int q = partition2(array, start, end);
            quickSort(array, start, q);
            quickSort(array, q + 1, end);
        }
    }
    
    public static int partition(int[] array, int start, int end){//correct version!!
        int pivot = array[start];
        int i = start + 1;
        for(int j = i; j < end + 1; j++){
            if(array[j] < pivot){   //make right side have value >= pivot, left < pivot
                swap(array, i, j);
                i++;
            }
        }
        swap(array, start, i-1);
        return i-1; //both sides will have value == pivot
    }
    
    public static int partition2(int[] array, int start, int end){//work, allow left == pivot, right == pivot. why?
        int pivot = array[start];
        int i = start;
        int j = end;                
        
        while(true){
            while(array[i] < pivot){    //if both sides == pivot, just exchange them. doesn't hurt
                                        //but if allow left == pivot, and doesn't exchange, will go 
                i++;                    //out of bound, and give infinite loop {3, 3, 1} will return 
            }                           //index 0, 2 again and again
            while(array[j] > pivot){
                j--;
            }
            if(i < j){//if i == j, doesn't need to exchange               
                swap(array, i, j);
                i++;    //this is key to handle duplicates, allow pointers to increase/decrease
                j--;
            }   
            else return j;
        }
        
    }
    
    //bucket sort
    public static void bucketSort(int[] array, int maxVal){
        int[] buckets = new int[maxVal + 1];
        for(int i = 0; i < maxVal + 1; i++){
            buckets[i] = 0;
        }
        for(int i = 0; i < array.length; i++){
            buckets[array[i]]++;
        }
        int outpos = 0;
        for(int i = 0; i < buckets.length; i++){
            for(int j = 0; j < buckets[i]; j++){
                array[outpos++] = i;
            }
        }
    }
    
    //Merge sort String
    public static void mergeSort(String[] array, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    private static void merge(String[] array, int start, int middle, int end) {
        int lengthLeft = middle - start + 1;
        int lengthRight = end - middle;
        String[] arrayLeft = new String[lengthLeft];
        String[] arrayRight = new String[lengthRight];
        int i, j, p;        

        for (i = 0; i < lengthLeft; i++) {
            arrayLeft[i] = array[start + i];
        }

        for (j = 0; j < lengthRight; j++) {
            arrayRight[j] = array[middle + j + 1];
        }

        for (p = start, i = 0, j = 0; p <= end; p++) {
            if (i < lengthLeft && j < lengthRight) {
                if (arrayLeft[i].compareTo(arrayRight[j]) <= 0) {
                    array[p] = arrayLeft[i++];

                } else {
                    array[p] = arrayRight[j++];

                }
            } else if (i == lengthLeft && j < lengthRight) {
                array[p] = arrayRight[j++];
            } else if (j == lengthRight && i < lengthLeft) {
                array[p] = arrayLeft[i++];
            }
        }
    }
    
        //Merge sort char
    public static void mergeSort(char[] array, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    private static void merge(char[] array, int start, int middle, int end) {
        int lengthLeft = middle - start + 1;
        int lengthRight = end - middle;
        char[] arrayLeft = new char[lengthLeft];
        char[] arrayRight = new char[lengthRight];
        int i, j, p;        

        for (i = 0; i < lengthLeft; i++) {
            arrayLeft[i] = array[start + i];
        }

        for (j = 0; j < lengthRight; j++) {
            arrayRight[j] = array[middle + j + 1];
        }

        for (p = start, i = 0, j = 0; p <= end; p++) {
            if (i < lengthLeft && j < lengthRight) {
                if (arrayLeft[i] <= arrayRight[j]) {
                    array[p] = arrayLeft[i++];

                } else {
                    array[p] = arrayRight[j++];

                }
            } else if (i == lengthLeft && j < lengthRight) {
                array[p] = arrayRight[j++];
            } else if (j == lengthRight && i < lengthLeft) {
                array[p] = arrayLeft[i++];
            }
        }
    }
}
