/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvfilecreation;

import java.io.*;
import java.util.*;

/**
 *
 * @author pradeep
 */
public class CSVFileCreation {
    
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter file name : ");
        String file = sc.nextLine() ;
        file = file.replace(" ","-");
        
        if( ! file.endsWith(".csv") )
            file = file+".csv" ;
        
        FileWriter fw = new FileWriter( new File(file) );
        
        System.out.println("\nEnter \"Name Salary\".");
        
        int count = 1;
        
        fw.append("id, name, salary\n");
        
        String str = sc.nextLine();
        
        while( str.length() > 0 )
        {
            
            String[] details = str.split(" ");
            
            String name = details[0];
            
            for(int i=1 ; i< details.length-1 ; i++ )
                name = name+" "+details[i] ;
            
            fw.append(count+", "+ name +", "+details[details.length-1]+"\n");
            
            fw.flush();
            
            count++;
            str = sc.nextLine();
        }
        
        fw.close();
        
        System.out.println("\n"+ (count-1) + " data written successfully." );
        
    }
    
}
