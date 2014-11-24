/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.Iterator;

/**
 *
 * @author huijun
 */
public interface Collection {
    void add(Object o);
    int size();
    Iterator iterator();
}
