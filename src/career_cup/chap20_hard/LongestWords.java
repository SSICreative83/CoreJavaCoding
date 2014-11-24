package CareerCup.Chap20_Hard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;

/**
 *
 * @author huijun
 */
public class LongestWords {
    public static int count = 0;
    public static ArrayList<String> result = new ArrayList<String>();    
    
    public static void longestStringMadeofOthers(String[] words){
        //build a dictionary using HashSet
        Set<String> dict = new HashSet<String>();
        dict.addAll(Arrays.asList(words));
        
        //O(nlogn) sorting time, descending order based on length
        Arrays.sort(words, new LengthComparator());
        
        //O(nd), d is the average length of words in dictionary
        for(String word : words){
            dict.remove(word);
            if(dfs(dict, word)){
                count++;
                result.add(word);
            }
            dict.add(word);
        }
    }
    
    public static boolean dfs(Set<String> dict, String target){
        if(dict.contains(target)) return true;
        for(int i = 1; i < target.length(); i++){
            if(dict.contains(target.substring(0, i)) && dfs(dict, target.substring(i)))
                return true;
        }
        return false;
    }
    
    public static class LengthComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return 1;
        else if (s1.length() > s2.length())
            return -1;
        else
            return 0;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {      
        //read input file into a list
        FileReader fileReader = new FileReader("./wordsforproblem.txt");  
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line;        
         
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }        
        
        if(lines.isEmpty())   return;
        String[] words = new String[lines.size()];
        lines.toArray(words); // fill the array       
        longestStringMadeofOthers(words);   //call the function
        
        System.out.println("Result:");
        System.out.println("total count is: " + count);
        if(result.size() > 0)   System.out.println("longest: " + result.get(0));
        if(result.size() > 1)   System.out.println("2nd longest: " + result.get(1));
    }
}
