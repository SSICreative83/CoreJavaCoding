/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Strategy;

/**
 *
 * @author huijun
 */
public class Test {
    public static void main(String[] args){
        Object[] array = {new Cat(3,3), new Cat(1,1), new Cat(5,5)};
        //DataSorter.bubbleSort(array);
        java.util.Arrays.sort(array);
        
        DataSorter.p(array);
                
    }
}
