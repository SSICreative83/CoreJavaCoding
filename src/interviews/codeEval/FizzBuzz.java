/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interview.CodeEval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author huijun
 */
public class FizzBuzz {
    public static void main (String[] args) throws Exception{
    
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split(" ");
            if (lineArray.length > 0) {
                //Process line of input Here
                int a = Integer.parseInt(lineArray[0]);
                int b = Integer.parseInt(lineArray[1]);
                int max = Integer.parseInt(lineArray[2]);
                for(int i = 1; i <= max; i++){
                    if(i % a == 0 && i % b == 0){
                        System.out.print("FB");
                    }else if(i % a == 0){
                        System.out.print("F");
                    }else if(i % b == 0){
                        System.out.print("B");
                    }else{
                        System.out.print(i);
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
  }    
}
