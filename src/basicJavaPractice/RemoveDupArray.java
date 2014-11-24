/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

/**
 *
 * @author huijun
 */
public class RemoveDupArray {
    public static void removeDup(int[] A){
        int len = A.length;
        
        if(len < 2) return;
        
        int i = 0;
        for(int j = 0; j < len; j++){
            if(A[i] != A[j]){
                A[++i] = A[j];
            }
        }    
        
        A[++i] = '\0'; 
    }
    
    public static void main(String[] args){
        int[] test = new int[]{1, 2, 2, 3, 3, 4, 5, 5, 7, 8};
        removeDup(test);
        for(int i : test){
        System.out.println(i);
        }
    }
}
