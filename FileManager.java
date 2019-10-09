/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlab3;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author PETER MITZEL
 */
public class FileManager {
    
    /**
     * Method to load a file and read it
     * @param file
     * @param list
     */
    public void fileLoader(String file, LinkedList list){
     
        Node addedNode;
        try{
            FileReader fR = new FileReader(file);
            BufferedReader bR = new BufferedReader(fR);
            String line = bR.readLine();
            
            while(line != null){
                String [] info = line.split(",");
                addedNode = new Node(info[0].trim(), info[1].trim(), info[2].trim());
                list.addNode(addedNode);
                line = bR.readLine();
            }
            bR.close();
        }
        
        catch(Exception e){
        }
        
    }
    
}
