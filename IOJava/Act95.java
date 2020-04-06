package IOJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act95 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String longest = "";
        try {
            fileReader = new FileReader("C:\\Users\\Administrator\\plusplus\\IOJava\\file.txt");
            bufferedReader = new BufferedReader(fileReader);

            String n = "";
            while ((n = bufferedReader.readLine()) != null) {
                String[] split = n.split(" ");
                for ( String i: split) {
                    if (i.length() > longest.length())
                        longest = i;
                }

            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(longest);
        bufferedReader.close();
        fileReader.close();
    }
}
