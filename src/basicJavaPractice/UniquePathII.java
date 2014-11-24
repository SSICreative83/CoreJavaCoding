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
public class UniquePathII {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[][] grid = obstacleGrid;
        int m = grid.length;
        int n = m > 0 ? grid[0].length : 0;
        
        int[][] sum = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 0){
                    if(i == 0 && j == 0){
                        sum[i][j] = 1;
                    }else{
                        sum[i][j] = (i > 0 ? sum[i - 1][j] : 0) + (j > 0 ? sum[i][j - 1] : 0);
                    }
                }
            }
        }
        if(m == 0 || n == 0){
            return 0;
        }else{
            return sum[m - 1][n - 1];
        }
    }

    public static void main(String[] args){
        int[][] test = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        int result = uniquePathsWithObstacles(test);
        System.out.println(result);
                
    }
}
