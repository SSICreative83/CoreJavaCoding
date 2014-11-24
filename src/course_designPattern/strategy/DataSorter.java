/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Strategy;
import java.lang.Comparable;
/**
 *
 * @author huijun
 */
public class DataSorter {
    
   public static void bubbleSort(Object[] array){
       int length = array.length;
       for(int i = length; i > 0; i--){
           for(int j = 0; j < i - 1; j++){
               Comparable o1 = (Comparable)array[j];
               Comparable o2 = (Comparable)array[j + 1];
               if(o1.compareTo(o2) == 1){
                   swap(array, j, j + 1);
               }                  
           }          
       }     
   } 
   
   public static void selectionSort(int[] array){//?
       int length = array.length;
       for(int i = 0; i < length; i++){
           for(int j = i + 1; j < length; j++){
               if(array[i] > array[j]){
                   //swap(array, i, j);
               }                  
           }          
       }     
   } 
      
   public static void p(Object[] array){
       for(Object e: array){
           System.out.print(e + " ");
       }
       System.out.println();
   }

    private static void swap(Object[] array, int i, int j) {
        Object tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
