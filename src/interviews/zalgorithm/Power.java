/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interview.ZAlgorithm;

/**
 *
 * @author huijun
 */
public class Power {
    	public static String power(String a){
	    String[] array = a.split(" ");
	    int len = array.length;
	    StringBuilder res = new StringBuilder();
	    
	    for(int i = 0; i < len; i++){
                String cur = array[i].trim();
                if(cur.charAt(0) > 'z' || cur.charAt(0) < 'a')  break;
                //process string
                int cnt = cur.length() / shortRep(cur).length();
                res.append(cnt);
                res.append(" ");
	    }
	    return res.toString().trim();
	}
        
        public static String shortRep(String s){
            int len = s.length();
            for(int i = 0; i < len / 2; i++){
                String cur = s.substring(0, i + 1);
                String remain = s.substring(i + 1);
                if(remain.equals(createPower(cur, remain.length() / cur.length()))){
                    return cur;
                }
            }
            return s;
        }
        
        public static String createPower(String s, int num){
            StringBuilder res = new StringBuilder();
            for(int i = 0; i < num; i++){
                res.append(s);
            }
            return res.toString();
        }
        
        public static void main(String[] args){
            System.out.println(power("ababab abcd abab ."));
        }
}
