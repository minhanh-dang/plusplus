package IOJava;

import java.io.File;

public class Act91 {
    public static void main(String[] args) {

            File file = new File("C:\\Users");
            String[] list = file.list();
            for (String i : list)
            System.out.println(i);

    }
}
