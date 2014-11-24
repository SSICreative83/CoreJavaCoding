/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interview.Yahoo;

import java.util.ArrayList;

/**
 *
 * @author huijun
 */
public class Fibo {
    public static void main(String[] args){
        System.out.println(fiboRecur(7));
        System.out.println(fiboIter(7));
    }
    
    //Iteration is more performant than recursion, right?

    //Not necessarily. This conception comes from many C like languages, 
    //where calling a function, recursive or not, had a large overhead and 
    //created a new stackframe for every call.

    //For many languages this is not the case, and recursion is equally or 
    //more performant than an iterative version. These days, even some C 
    //compilers rewrite some recursive constructs to an iterative version, 
    //or reuse the stack frame for a tail recursive call.
    
    //comparing a manually-managed stack to the function call stack. 
    //Recursion is more elegant
    
    public static int fiboRecur(int n){
        if(n <= 0)  return 0;
        if(n == 1 || n == 2)    return 1;
        return fiboRecur(n - 1) + fiboRecur(n - 2);
    }
    
    public static int fiboIter(int n){
        if(n <= 0)  return 0;
        if(n == 1 || n == 2)    return 1;
        
        int[] result = new int[]{1, 1, 2};
        //ArrayList<Integer> re = new ArrayList<>();
        //re.add(1);
        //re.add(2);
        //System.out.println(re);   //ArrayList can be printed, array can't
        int i = 3;
        while(i <= n){
            result[2] = result[0] + result[1];
            result[0] = result[1];
            result[1] = result[2];
            i++;
        }
        
        return result[2];
    }
}
