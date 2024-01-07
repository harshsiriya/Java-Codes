package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class java70_fileHandling {
    public static void main(String[] args){
        File myfile = new File("Mytext.txt");
        try{
            myfile.createNewFile();           // Creating a new file
        }catch(IOException e){
            System.out.println(e);
        }

        try{
            FileWriter myFileWriter = new FileWriter("Mytext.txt");
            myFileWriter.write("This is my first paragraph of file handling \n Good bye \n your sincere \n harsh");      // writting to a file
            myFileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            Scanner old = new Scanner(myfile);
            while(old.hasNextLine()){
                String line = old.nextLine();            // reading from a file
                System.out.println(line);
            }
            old.close();
        }catch(FileNotFoundException f){
            System.out.println(f);
        }



        // if(myfile.delete()){                                                  // for deleting the file
        //     System.out.println("Successfully deleted the file");
        // }else{
        //     System.out.println("Some erroe occured during deleting");
        // }
        

    }
    
}
