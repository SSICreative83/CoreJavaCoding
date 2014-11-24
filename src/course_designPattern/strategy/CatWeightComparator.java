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
public class CatWeightComparator implements java.util.Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        Cat c1 = (Cat) o1;
        Cat c2 = (Cat) o2;
        if (c1.weight > c2.weight) {
            return -1;
        } else if (c1.weight < c2.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
