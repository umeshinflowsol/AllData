package com.inflowsol.collection.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File file = new File("Doc1.docx");
           if (file.createNewFile()){
               System.out.println("File Created:"+file.getName());

           }else{
               System.out.println("File already exists.");
           }
        } catch (IOException e) {
            System.out.println("an error is occured");
            e.printStackTrace();
        }
    }
}
