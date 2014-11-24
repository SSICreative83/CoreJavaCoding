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
public class ProblemsTests {

    public static void main(String[] args) {
        String s = "Huijnmuvccc";
        String s2 = "ccccccccc";
        char[] s3 = new char[]{'f','f','f','f','f'};
        char[] s4 = new char[]{'a','b','d','d','e'};
        char[] s5 = new char[]{'e','e','d','b','a'};
        char[] s6 = new char[]{'e',' ','d','b','a'};
        int[][] s7 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int n = 3;
        int[][] s8 = new int[][]{{1,2,3},{4,0,6},{7,8,9}};
        
        //P1
        System.out.println(UniqueChar.isUniqueStringLocal(s));
        
        //P2
        System.out.println(ReverseString.reverseString(s));
        
        //P3
        System.out.println(RemoveDup.removeDupCharLocal(s3));
        
        //P4
        System.out.println(Anagram.isAnagram(s4, s5));
        
        //P5
        System.out.println(ReplaceSpace.replaceSpace(s6));
        
        //P6
        MatrixRotation.rotate(s7, n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(s7[i][j]);
            }
            System.out.println('\n');
        }
        
        //P7
        int[][] s9 = MatrixSetZero.matrixSetZero(s8, 3, 3);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(s9[i][j]);
            }
            System.out.println('\n');
        }
    }

}
