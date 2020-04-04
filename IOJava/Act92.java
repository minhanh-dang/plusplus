package IOJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Act92 {
    public static void main(String[] args) throws Exception {

//        FileReader file = new FileReader("C:\\Users\\Administrator\\Pictures\\pictures");
//        BufferedReader fileReader = new BufferedReader(file);
//        String line = "";
//        while ((line = fileReader.readLine()) != null) {
//        }
//        file.close();
//        fileReader.close();
        File file = new File("C:\\Users\\Administrator\\Pictures\\pictures");
        String[] list = file.list();
        for (String i : list){
            if (i.endsWith(".png"))
                System.out.println(i);
        }
    }
}
