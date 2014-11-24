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
import java.util.*;

public class NBiggest {
    public static void main (String[] args) throws Exception{

        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        List<String> input = new ArrayList<>();
        int n = Integer.parseInt(in.readLine());
        String line;
        while ((line = in.readLine()) != null) {
            input.add(line);
        }

        Collections.sort(input);
        for(int i = 0; i < n; i++){
            System.out.println(input.get(i));
        }
    }
    
    public class LengthComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2){
  
            if(o1.length() < o2.length())   return -1;
            else if(o1.length() == o2.length()) return 0;
            else return 1;
        }
    }
}   

