
package generalinterface;


import javax.swing.JOptionPane;
import showm.showmessage;

public class maingenaral extends showmessage  {
    
public void g(){
    
    g1 obj = new g1();
    obj.g1main();
   
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
    
    public void expecti(Exception e){
        
        JOptionPane.showMessageDialog(null, e, super.cms, 0);
    }

 
   
}



