/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huijun
 */
public class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<Filter>();
    
    public FilterChain addFilter(Filter f){
        this.filters.add(f);
        return this;
    }
    
    public String doFilter(String str){
       String r = str;
       for(Filter f : filters){
           r = f.doFilter(r);
       }                      
       return r;
    }
}
