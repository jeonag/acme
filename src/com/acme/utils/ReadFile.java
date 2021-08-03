package com.acme.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Read text file
 *
 * @author JOG.
 * @version 1.0
 */
public class ReadFile {
    /**
     *Read text file from directory
     *
     * @return
     * @throws IOException
     */
    public String readTxtFile() throws IOException {
        File file = new File("C:\\Users\\JHON\\Desktop\\test.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String read;
        String register = "";
        while ((read = bufferedReader.readLine()) != null)
            register = read;

        bufferedReader.close();
        return register;
    }
}
