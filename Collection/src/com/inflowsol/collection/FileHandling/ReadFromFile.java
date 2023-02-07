package com.inflowsol.collection.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try{
            File obj = new File("C:\\Users\\Umesh\\Desktop\\umesh\\NewFile.txt");
            Scanner scanner = new Scanner(obj);
            while (scanner.hasNextLine()){
                String mydata=scanner.nextLine();
                System.out.println("mydata:"+mydata);
            }

        }catch (FileNotFoundException e){
            System.out.println("an error has occured");
            System.out.println(e);
        }

    }
}
