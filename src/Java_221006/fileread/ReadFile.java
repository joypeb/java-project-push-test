package Java_221006.fileread;

import java.io.*;
public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./src/Java_221006/fileread/a_file.txt");
        char ch = (char)reader.read();
        System.out.println(ch);
    }
}