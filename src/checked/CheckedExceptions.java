/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Nick
 */
public class CheckedExceptions {
    public static void OpenFileChecked() throws FileNotFoundException, IOException{
        FileReader x= new FileReader("nofile.txt");
        try{
            x.close();
        }
        catch(IOException ex){
            throw new IOException();
            
        }
        
    }
}
