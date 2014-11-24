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
public class MsgProcessor {
    private String msg;   
    private FilterChain fc;
    
    public String getMsg(){
        return msg;
    }
    public void setMsg(String msg){
        this.msg = msg;
    }
    
    /**
     * @return the fc
     */
    public FilterChain getFc() {
        return fc;
    }

    /**
     * @param fc the fc to set
     */
    public void setFc(FilterChain fc) {
        this.fc = fc;
    }
    
    public String process(){               
       return fc.doFilter(msg);
    }
}
