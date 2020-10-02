package binary_file;

import java.io.*;
import java.util.List;

public class ObjectFile<E> {
    public  void writeObjectFile(String pathname, List<E> customers) throws IOException {

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(pathname));
        objectOutputStream.writeObject(customers);
        objectOutputStream.close();
    }
    public  List<E> readObjectFile(String pathname) throws IOException {
        List<E> customers=null;
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(pathname));
        try {
            customers=(List<E>)objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
