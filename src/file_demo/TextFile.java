package file_demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFile {
    public void writeTextFile(String pathname){
        try {
            FileWriter fileWriter=new FileWriter(pathname,true);
            fileWriter.write("\nMoi nguoi co gang");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<String> readTextFile(String pathname){
        List<String> result=new ArrayList<>();
        try {
            FileReader fileReader=new FileReader(pathname);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while((line=bufferedReader.readLine())!=null){
                result.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
