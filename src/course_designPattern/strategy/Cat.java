/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Strategy;

/**
 *
 * @author huijun
 */
public class Cat implements java.lang.Comparable<Cat>{
    int height;
    int weight;
    //Comparator comparator = new CatHeightComparator();
    java.util.Comparator<Cat> comparator = new CatWeightComparator();

    public Cat(int height, int weight){
        this.height = height;
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        return height + "|" + weight;
    }

    @Override
    public int compareTo(Cat o) {
        return comparator.compare(this, o);
    }
}
