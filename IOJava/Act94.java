package IOJava;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Act94 {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader("C:\\Users\\Administrator\\plusplus\\IOJava\\file.txt");
            bufferedReader = new BufferedReader(fileReader);
            String n = "";
            while ((n = bufferedReader.readLine()) != null) {
                System.out.println(n);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
            ////////////////////////////////////
        try {
            fileReader = new FileReader("C:\\Users\\Administrator\\plusplus\\IOJava\\file.txt");
            bufferedReader = new BufferedReader(fileReader);

            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        bufferedReader.close();
        fileReader.close();
    }
}