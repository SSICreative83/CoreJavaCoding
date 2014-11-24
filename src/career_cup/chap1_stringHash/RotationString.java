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
public class RotationString {

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() == s2.length()) {
            String s3 = s1 + s1;
            return isSubString(s2, s3);
        } else {
            return false;
        }
    }

    public static boolean isSubString(String s1, String s2) {
        return true;
    }
}
