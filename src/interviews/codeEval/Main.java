/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interview.CodeEval;

/**
 *
 * @author huijun
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main (String[] args) throws Exception{

        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split(" ");
            if (lineArray.length > 0) {
                System.out.println(result(lineArray));
            }
        }
    }
    
    public static String result(String[] array){
        return "";
    }
}