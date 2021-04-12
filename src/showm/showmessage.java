/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showm;

import javax.swing.JOptionPane;

/**
 *
 * @author Some Nath
 */
public class showmessage extends abs implements face {

    
    public String cms ="Crime_Management_System";
    @Override
    public void done() {
        JOptionPane.showMessageDialog(null, "Done",cms,1);
    }

    @Override
    public void welcome() {
       
        JOptionPane.showMessageDialog(null, "Welcome",cms,-1);
    }

    @Override
    public void error() {
        JOptionPane.showMessageDialog(null, "User_Name and Password Do Not Match"," Crime_Management_System",0);
    }
    
    public void logout(){
        JOptionPane.showMessageDialog(null, "Want to Log out"," Crime_Management_System",0);
    }

    public void confirm(){
        JOptionPane.showMessageDialog(null, "Confirm"," Crime_Management_System",3);
    } 
}













