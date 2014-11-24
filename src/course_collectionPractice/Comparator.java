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
public interface Comparator<T> {
    
    int A = 2;  //NO generic
    
    void compare(T t);  //can be generic
}
