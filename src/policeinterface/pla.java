/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package policeinterface;

import generalinterface.jsj;
import javax.swing.JOptionPane;

/**
 *
 * @author somenath
 */
public class pla extends jsj implements police {

    @Override
    public void setIcon() {
        
    }
    
       public void expecti(Exception e){
        
        JOptionPane.showMessageDialog(null, e, "Crime_Management_System", 0);
    }
       
       

}
