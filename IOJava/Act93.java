package IOJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Act93 {
    public static void main(String[] args) throws Exception {
//        FileReader file = new FileReader("C:\\Users");
//        if (file != null)
//            System.out.println("Exist");
//        else
//            System.out.println("Not Exist");
        File file = new File("C:\\Users");
        if (file != null)
            System.out.println("Exist");
        else
          System.out.println("Not Exist");
    }
}
