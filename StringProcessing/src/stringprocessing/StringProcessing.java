/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tay
 */
public class StringProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
       String [] records = new String[100];
        
        try {
            Scanner scan = new Scanner(new File(args[0]));
            
            int currentIndex = 0;
            while(scan.hasNext()){
                String[] line = scan.nextLine().split(",");
                String firstName = line[0];
                String lastName = line[1];
                String age = line [2];
                String gender = line[3];
                String phoneNumber = line[4];
                String email = line[5];
                
                records[currentIndex] = String.format("%-20s%-20s%-10s%10s%15s%40s" , line[0], line[1], line[2], line[3], line[4], line[5]); // The percent symbol uses 6 spots for each line array
                
                System.out.println(records[currentIndex]);
                currentIndex ++;
            }
        } catch (FileNotFoundException ex){
            System.err.println("Could not find input file");
            }
        }
        // TODO code application logic here
    }
    

