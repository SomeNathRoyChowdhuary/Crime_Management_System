/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starting;

import javax.swing.JOptionPane;
import showm.showmessage;

/**
 *
 * @author SomeNath
 */
public class logclass extends showmessage {
    
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
    
    public void expecti(Exception e){
        
        JOptionPane.showMessageDialog(null, e, super.cms, 0);
    }
    
    public  void startingmain() {
        fornt obj = new fornt();
        obj.mfornt();
    }
    
}




