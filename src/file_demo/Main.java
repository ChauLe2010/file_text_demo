package file_demo;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextFile textFile=new TextFile();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap duong dan: ");
        String pathname=sc.nextLine();
       // textFile.writeTextFile("content.txt");
        List<String> content=textFile.readTextFile("content.txt");
        for(int i=0;i<content.size();i++){
            System.out.println(content.get(i));
        }


    }
}
