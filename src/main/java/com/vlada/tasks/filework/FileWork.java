package com.vlada.tasks.filework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWork {
    public static void readFromFile() {
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("file.txt");
            bufferedReader = new BufferedReader(fileReader);
            String sCurrentLine;
            while ((sCurrentLine = bufferedReader.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong. Contact admin.");
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }

            } catch (IOException e) {
                System.out.println("Something went wrong. Contact admin.");
            }
        }
    }
}
