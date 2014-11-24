/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_collection;

/**
 *
 * @author huijun
 */
public class Student<T1, T2> {
    private T1 javaScore;
    private T2 oracleScore;

    public T1 getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(T1 javaScore) {
        this.javaScore = javaScore;
    }

    public T2 getOracleScore() {
        return oracleScore;
    }

    public void setOracleScore(T2 oracleScore) {
        this.oracleScore = oracleScore;
    }
    
    public Student(T1 javaScore, T2 oracleScore){
        this.javaScore = javaScore;
        this.oracleScore = oracleScore;
    }
    
    public static void main(String[] args){
        Student<String, Integer> stu = new Student<>("80", 90);
        stu.setJavaScore("good");
        int i = stu.getOracleScore();
    }
}
