package com.inflowsol.collection.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileInFormation {
    public static void main(String[] args) {

        try {
            File file= new File("umesh.txt");
            if (file.createNewFile()) {
                //if file is exists return file name
                System.out.println("File name:" + file.getName());
                //returning the path of the file
                System.out.println("path of file:"+ file.getAbsolutePath());
                //checking whether the file is writeable:
                System.out.println("file is writeable:"+file.canWrite());
                //checking whether the file is Readable:
                System.out.println("file is writeable:"+file.canRead());
                //reading the legnth of the file
                System.out.println("file length is:"+file.length());
            }else{
                System.out.println("file doesnt exits");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("working succesfully");
        }
    }
}
