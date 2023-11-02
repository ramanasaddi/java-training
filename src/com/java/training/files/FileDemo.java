package com.java.training.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        try{
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created :" + myObj.getName());
                FileWriter mywriter = new FileWriter(myObj);
                System.out.println("Writing content to file name :" +myObj.getName());

                mywriter.write("Testing file writer use cases using Scanner class");

                mywriter.close();

                Scanner myReader = new Scanner(myObj);
                while(myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            }
            else {
                System.out.println("File already exists..");
            }
        }
        catch (IOException e) {
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
    }
}
