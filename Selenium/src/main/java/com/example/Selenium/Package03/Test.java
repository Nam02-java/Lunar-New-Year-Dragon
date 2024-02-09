package com.example.Selenium.Package03;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        File folder = new File("E:\\New folder");
        File[] files = folder.listFiles();
        if (files != null && files.length > 0) {
            Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
            File latestFile = files[0];
            System.out.println(latestFile.getName());
            String newFileName = "asd" + ".mp3";
            File newFile = new File(folder, newFileName);
            latestFile.renameTo(newFile);
        }
    }
}
