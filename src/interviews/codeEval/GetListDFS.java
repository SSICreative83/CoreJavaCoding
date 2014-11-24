/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interview.CodeEval;

import java.util.*;

/**
 *
 * @author huijun
 */
public class GetListDFS {
    
    public List<String> getList(String s, int n){
        if(s.length() == 0 || n == 0)   return new ArrayList<String>();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        List<String> res = new ArrayList<>();
        dfs(arr, "", res, n);
        return res;
    }
    
    public void dfs(char[] arr, String tmp, List<String> res, int n){
        if(tmp.length() == n){
            res.add(tmp);
            return;
        }
        for(int i = 0; i < arr.length; i = increment(arr, i)){
            String ntmp = tmp + arr[i] + "";
            dfs(arr, ntmp, res, n);
        }
    }
    
    public int increment(char[] arr, int i){
        i++;
        while(i < arr.length && arr[i] == arr[i - 1]  )    i++;
        return i;
    }
    
    public static  void main(String[] args){
        GetListDFS o = new GetListDFS();
        System.out.println(o.getList("abb", 3));
    }
}
