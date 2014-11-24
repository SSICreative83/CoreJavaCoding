/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap9_SortSearch;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author huijun
 */
public class SortStringArray {
    public static void sortStringArray(String[] array){
        String[] sortedArray = new String[array.length];
        String[] sortedStringsArrayBySortedArray = new String[array.length];
        int[] posOfArray = new int[array.length];
        Hashtable table = new Hashtable();
        
        for(int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
            sortedStringsArrayBySortedArray[i] = array[i];
        }
        
        //sort original array
        Sortings.mergeSort(sortedArray, 0, sortedArray.length - 1);
                
        System.out.println("original array:");
        for(String s : array){
            System.out.println(s);
        }
        System.out.println();
        
        System.out.println("sorted array:");
        for(String s : sortedArray){
            System.out.println(s);
        }
        System.out.println();
        
        //sort strings by sorted array
        for(int i = 0; i < sortedArray.length; i++){
            char[] s = sortedArray[i].toCharArray();
            Sortings.mergeSort(s, 0, s.length - 1);
            sortedStringsArrayBySortedArray[i] = new String(s);
        }
              
        //put sortedStringsArrayBySortedArray as key, sortedArray as value to a hashtable
        for(int i = 0; i < sortedStringsArrayBySortedArray.length; i++){
              table.put(sortedStringsArrayBySortedArray[i], sortedArray[i]);
        }
           
        //get sorted keys array
        String[] sortedKeys = new String[table.keySet().size()];
        int h = 0;
        for(Object key : table.keySet()){
            sortedKeys[h++] = (String)key;
        }
             
        //print out values for sorted keys
        //THIS STEP has problem since later values will overwrite previous values
        System.out.println("result:");
        Sortings.mergeSort(sortedKeys, 0, sortedKeys.length-1);
        for(String key: sortedKeys){
            System.out.println(table.get((Object)key));
        }
        
    }
    
}
