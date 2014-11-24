/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Course_DesignPatterns.ChainOfResponsibility;

/**
 *
 * @author huijun
 */
public class SensitiveFilter implements Filter{
    @Override
    public String doFilter(String str){
        String r = str.replace("被就业", "就业");
        return r;
    }
}
