/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NineChapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author huijun
 */
public class Subsets {
    
    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(S == null) {
            return res;
        }
        
        Arrays.sort(S);
        List<Integer> tmp = new ArrayList<>();
        dfs(S, 0, tmp, res);
        
        return res;
    }
    
    public void dfs(int[] S, int start, List<Integer> tmp, List<List<Integer>> res) {
        res.add(tmp);
        
        for(int i = start; i < S.length; i++) {
            if(i != start && S[i] == S[i - 1]){  //remove duplicates
                continue;
            }
            List<Integer> ntmp = new ArrayList<>(tmp);
            ntmp.add(S[i]);
            dfs(S, i + 1, ntmp, res);
        }
    }

    public void dfs2(int[] S, int start, List<Integer> tmp, List<List<Integer>> res) {
        res.add(tmp);
        
        for(int i = start; i < S.length; i = increment(S, i)) {
            List<Integer> ntmp = new ArrayList<>(tmp);
            ntmp.add(S[i]);
            dfs(S, i + 1, ntmp, res);
        }
    }
    
    public int increment(int[] S, int i) {
        i++;
        while(i < S.length && S[i] == S[i - 1]) {
            i++;
        }
        
        return i;
    }
}
