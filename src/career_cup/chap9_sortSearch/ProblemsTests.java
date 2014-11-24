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
public class ProblemsTests {
    public static void main(String[] args){
        //test sorting algorithms
        int[] array = {3, 3, 4, 1, 3, 9, 4, 3};
        Sortings.quickSort(array, 0, 7);
        for(int element: array){
            //System.out.print(element + " ");           
        }
        System.out.println();  
        
        int[] array2 = {3, 3, 4, 1, 3, 9, 4, 3};
        Sortings.bucketSort(array2, 9);
        for(int element: array2){
            //System.out.print(element + " ");           
        }
        System.out.println();  
        
        //P1, merge arrayB into arrayA
        int[] arrayA = new int[]{3, 5, 0, 0};
        int[] arrayB = new int[]{1, 4};
        MergeArrays.mergeArrays(arrayA, arrayB, 2, 2);
        for(int element: arrayA){
            //System.out.print(element + " ");           
        }
        System.out.println();  
        
        //P2
        String[] stringArray = new String[]{"gba", "odc", "cod", "abg"};  
        //SortStringArray.sortStringArray(stringArray);
        
        //P3
        
        
    }
}
