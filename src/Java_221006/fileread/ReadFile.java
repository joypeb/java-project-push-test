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

    public String readNTxtFile(String filename,int num) {
        try(BufferedReader br = new BufferedReader(new FileReader(filename),8*1024)) {
            String txt = "";
            for(int i=0; i<num; i++) {
                txt += (char)br.read();
            }
            return txt;
        } catch (IOException e) {
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
        System.out.println(rtf.readNTxtFile(rtf.getFilename(), 4));
    }
}