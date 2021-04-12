/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package policeinterface;

import javax.swing.JOptionPane;
import showm.showmessage;

/**
 *
 * @author SomeNath
 */
public class mainpolice extends showmessage{
    public void mainpolice() {
        
    
        p1 obj = new p1();
        obj.p1main();
    }
    
     @Override
    public void error(){
        
        super.error();
    }
    
    @Override
    public void done(){
        super.done();
    }
    
    @Override
    public void welcome(){
        
        super.welcome();
    }
    
    @Override
    public void logout(){
        
        super.logout();
    }
    
    @Override
    public void confirm(){
        
        super.confirm();
    }
    
 
 
}





