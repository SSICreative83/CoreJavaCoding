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
public class MergeArrays {

    //if extra space is allowed
    public static void mergeArrays(int[] arrayA, int[] arrayB, int lengthA, int lengthB) {
        int[] arrayACopy = new int[lengthA];
        int i = 0, j = 0, k = 0;
        
        for(i = 0; i < lengthA; i++){
            arrayACopy[i] = arrayA[i];
        }
        
        for(k = 0, i = 0, j = 0; k < arrayA.length; k++){
            if(i < lengthA && j < lengthB){
                if(arrayACopy[i] <= arrayB[j]){
                    arrayA[k] = arrayACopy[i++];
                }
                else
                    arrayA[k] = arrayB[j++];
            }
            else if(i < lengthA){
                arrayA[k] = arrayACopy[i++];
            }
            else if(j < lengthB){
                arrayA[k] = arrayB[j++];
            }
        }     
    }
}
