package file_demo;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void opeFile(String pathname) throws IOException {
        File file=new File(pathname);
        if(!file.exists())
            file.createNewFile();

    }
    public static void main(String[] args) throws IOException {
        File file=new File("src/file_demo/test.txt");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        File file1=new File("testfile.txt");
        if(!file1.exists()){
            file1.createNewFile();
        }

    }
}
