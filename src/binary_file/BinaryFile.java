package binary_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("test.data");
            int[] arr={-1,2,-3,4,5};
            for(int i=0;i<arr.length;i++){
                fileOutputStream.write(arr[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream=new FileInputStream("test.data");
            while(true){
                int value=fileInputStream.read();
                if(value<0)
                    break;
                System.out.println(value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
