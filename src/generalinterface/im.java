package generalinterface;



import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author somenath
 */
public class im extends jsj implements resizeimage{
      public String im(){
        String path = "";
           JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
             path = selectedFile.getAbsolutePath();
    }
        return path;
        }

    @Override
    public ImageIcon resizeimage() {
          return null;
    }

    @Override
    public ImageIcon resizeimage2() {
          return null;
        
    }
    
}
