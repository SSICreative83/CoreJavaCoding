/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicJavaPractice;

/**
 *
 * @author huijun
 */
public class Atoi {
    public static int atoiself(String str){
        if(str.length() == 0)    return 0;
        
        //negative integer
        char first = str.charAt(0);
        boolean positive = true;
        if(first == '+' || first == '-'){
            str = str.substring(1);
            positive = first == '+' ? true : false;
        }
        
        //discard non-valid characters (at the end)
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) - '0' < 0 || str.charAt(i) - '0' > 9) {
                if(i == 0)  return 0;
                str = str.substring(0, i);
                break;
            }
        }
        
        long result = 0;
        
        //convert 
        for(int j = 0; j < str.length(); j++){
            int cur = str.charAt(j) - '0';
            if(cur < 0 || cur > 9) break;
            
            result *= 10;
            result += cur;
            System.out.println(result);
            if (result > Integer.MAX_VALUE && positive == true) {
			    return Integer.MAX_VALUE;
		    } else if (result > 2147483648.0 && positive == false) {
			    return Integer.MIN_VALUE;
		    }
        }
        
        return positive ? (int)result : (-1) * (int)result;
    }
    
    public static void main(String[] args){
        //System.out.println(Integer.MAX_VALUE);
        System.out.println(atoiself("2147483648"));
    }
}
