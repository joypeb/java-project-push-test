package Java_221006.fileread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

class LineFile {
    private String fileName;

    public LineFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void readLine(String fileName) {
        try(BufferedReader br = new BufferedReader(new FileReader(this.fileName))){
            String str;
            System.out.println(br.readLine());
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        }catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}

public class RealLineFile {
    public static void main(String[] args) {
        LineFile lineFile = new LineFile("./src/Java_221006/fileread/a_file.txt");
        lineFile.readLine(lineFile.getFileName());
    }
}
