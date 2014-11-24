/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap1_StringHash;

/**
 *
 * @author huijun
 */
public class MatrixRotation {
    public static void rotate(int[][] matrix, int n){   //can change the matrix? YES
        if(n < 2){
            return;
        }
        
        for(int layer = 0; layer < n/2; layer++){
            int first = layer;
            int last = n - first - 1;                     
            
            for(int offset = 0; offset < last - first; offset++){
                int top = matrix[first][first + offset];
                //top left = bottom left
                matrix[first][first + offset] = matrix[last - offset][first]; 
                //bottom left = bottom right
                matrix[last - offset][first] = matrix[last][last - offset];
                //bottom right = top right
                matrix[last][last - offset] = matrix[first + offset][last];
                //top right = top left
                matrix[first + offset][last] = top;
            }
        }
    }
}
