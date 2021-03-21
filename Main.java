package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        File f1 = new File("RemonFile", 3.2f,  "ooooo");

        System.out.println(f1.getFileName());
        f1.FileSizeChecker(f1.getFileSize());
        f1.FileTypeChecker(f1.getFileType());
        System.out.println("File Created at " + f1.DateIncrementer());
    }
}