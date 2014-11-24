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
public class Main {
    public static void main(String[] args){
        String msg = "hello:), <script>, 被就业";
        MsgProcessor mp = new MsgProcessor();
        mp.setMsg(msg);

        FilterChain fc = new FilterChain();
        fc.addFilter(new XmlFilter()).addFilter(new SensitiveFilter());
        mp.setFc(fc);
        
        String result = mp.process();
        System.out.println(result);
        
        FilterChain fc2 = new FilterChain();
        fc2.addFilter(new SensitiveFilter());
        fc.addFilter(fc2);  //FilterChain is also a Filter!
    }
    
}
