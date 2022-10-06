package Java_221006.fileread;

import java.io.File;

public class NowDirFileList {
    public static void main(String[] args) {
        File dir = new File("./");
        File files[] =  dir.listFiles();
        for(File file : files) {
            System.out.println(file);
        }
    }
}
