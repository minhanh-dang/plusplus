package collectionsAndGenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class act82 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of colors: ");
        int num = sc.nextInt();
        System.out.println("Input colors:");
        for (int i = 0; i < num; i ++){
            String value = sc.next();
            colors.add(value);
        }
        System.out.println("Input color and position:");
        String color = sc.next();
        int position = sc.nextInt();
        colors.add(position, color);
        System.out.println(colors);
    }
}
