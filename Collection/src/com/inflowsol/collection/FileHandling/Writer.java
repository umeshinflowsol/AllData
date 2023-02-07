package com.inflowsol.collection.FileHandling;

import java.io.File;

public class Writer {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Umesh\\Desktop\\umesh\\NewFile.txt");
        if (file.canWrite()){
            String s="alndkasndksandaks";
            System.out.println(s);
        }
    }
}
