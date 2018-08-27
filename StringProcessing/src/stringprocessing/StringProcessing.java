/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author Tay
 */
public class StringProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        try {
            Scanner scan = new Scanner(new File(args[0]));
            
            while(scan.hasNext()){
                scan.nextLine().spilt(",");
            }
        } catch (FileNotFoundException ex){
            Logger.getLogger(StringProcessing.class.getName()).log(Level.SEVERE);
            System.err.println("Could not find input file");
            }
        }
        // TODO code application logic here
    }
    
}
