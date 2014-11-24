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
import java.util.Collection;
import java.util.Set;

public class MyClass  {
    
    public static void main(String[] args){
        byte arr[] = new byte[]{8,3,5,9, 10, 2};
        for(final int i: getCharArray(arr))
            System.out.print(i + " ");
    }
    
    static char[] getCharArray(byte[] arr){
        char[] carr = new char[arr.length];
        int i=0;
        for(byte c:arr){
            carr[i] = (char)c;
            i++;
        }
        return carr;
    }

}
