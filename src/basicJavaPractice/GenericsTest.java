/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicJavaPractice;

import java.util.Collection;

/**
 *
 * @author huijun
 */
public class GenericsTest<T> {

    public int Add(int a, int b) {
        return a + b;
    }

    public double Add(double a, double b) {
        return a + b;
    }

    public float Add(float a, float b) {
        return a + b;
    }

    public <T> T Add(T a, T b) {
        return a;
    }

    public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // Correct
        }
    }

}
