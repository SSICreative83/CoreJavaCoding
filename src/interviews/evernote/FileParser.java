
package Interview.Evernote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author huijun
 */
public class FileParser {

    public List<String> mostFrequentWords(String input, int n) {

        List<String> res = new ArrayList<>();
        List<WordFreq> tmp = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();       
        String[] array = input.split("\\W+");   //all non-word characters are word breaker

        //put words into a hashmap and count words frequency
        for (String word : array) {
            
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        
        //build WordFreq object and add them into tmp list
        for (String key : map.keySet()) {
            tmp.add(new WordFreq(key, map.get(key)));
        }

        //sort words by frequency, this is O(mlogm) time, m is number of words
        Collections.sort(tmp, new FreqSortComparator());

        //add n words or max number of words in input into result
        for (int i = 0; i < n && i < tmp.size(); i++) {
            res.add(tmp.get(i).key);
        }

        return res;
    }
    
    class WordFreq {

        String key;
        int freq;

        WordFreq(String key, int freq) {
            this.key = key;
            this.freq = freq;
        }
    }

    class FreqSortComparator implements Comparator<WordFreq> {

        @Override
        public int compare(WordFreq o1, WordFreq o2) {
            if (o1.freq < o2.freq) {
                return 1;
            } else if (o1.freq > o2.freq) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        //this is an example of input
        String test = "pear pear \n test apple$apple()apple & &  test   test";
        
        List<String> res = new FileParser().mostFrequentWords(test, 5);
        System.out.println(res.toString());
    }
}
