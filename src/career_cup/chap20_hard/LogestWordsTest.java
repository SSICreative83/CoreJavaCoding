/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap20_Hard;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author huijun
 */
public class LogestWordsTest {
    public static int count = 0;
    public static ArrayList<String> result = new ArrayList<>();
    
    //Solution1: brute-force. This doesn't work!!! since it doesn't do dfs
    public static String longestStringMadeofOther2(String[] words){
        Arrays.sort(words, new LengthComparator());
        for (String word : words) {
            String backup = new String(word);
            for (String otherWord : words) {
                if (!otherWord.equals(backup) && word.contains(otherWord)) {
                    word = word.replace(otherWord, "");
                }
            }
            if (word.length() == 0)
                return backup;
        }
        return null;
    }
    
    //solution2: dfs
    public static void longestStringMadeofOthers(String[] words){
        //build a dictionary using HashSet
        Set<String> dict = new HashSet<>();
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
    
    public static void main(String[] args) throws IOException{                       
        FileReader fileReader = new FileReader("src/CareerCup/Chap20_Hard/wordsforproblem.txt");
        List<String> lines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line; 
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        }
        
        String[] words = new String[lines.size()];
        lines.toArray(words); // fill the array
        System.out.println("Result is:");
        
        longestStringMadeofOthers(words);
        
        System.out.println("total count is: " + count);
        System.out.println("longest: " + result.get(0));
        System.out.println("2nd longest: " + result.get(1));
    }
}
