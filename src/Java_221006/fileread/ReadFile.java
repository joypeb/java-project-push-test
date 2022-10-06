package Java_221006.fileread;

import java.io.*;

class ReadTxtFile {
    private String filename;

    public ReadTxtFile(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return this.filename;
    }

    public String readTxtFile(String filename) {
        try(BufferedReader br = new BufferedReader(new FileReader(filename),2)) {
            return (char)br.read() + "" +(char)br.read();
        } catch (Exception e) {
            new RuntimeException(e);
        }
        return "error";
    }
}

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./src/Java_221006/fileread/a_file.txt");
        char ch = (char) reader.read();
        System.out.println(ch);

        ReadTxtFile rtf = new ReadTxtFile("./src/Java_221006/fileread/a_file.txt");
        System.out.println(rtf.readTxtFile(rtf.getFilename()));
    }
}