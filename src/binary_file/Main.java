package binary_file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Customer> customers=new ArrayList<>();
//        customers.add(new Customer(1,"Thao","HN"));
//        customers.add(new Customer(2,"Nam","HP"));
//        customers.add(new Customer(3,"Anh","BN"));
//        customers.add(new Customer(4,"Hoang","NH"));
        ObjectFile<Customer> objectFile=new ObjectFile<>();
      //  objectFile.writeObjectFile("test.data",customers);

        //List<Customer> newCustomers=null;

        customers=objectFile.readObjectFile("test.data");
        for(int i=0;i<customers.size();i++){
            System.out.println(customers.get(i));
        }
    }
}
