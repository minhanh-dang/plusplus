package collectionsAndGenerics;

import java.util.ArrayList;
import java.util.Scanner;

public class act81 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        System.out.println("Nhap " + n + " phan tu: ");

            for (int i = 0; i < n; i++){
            int value = sc.nextInt();
            arrayList.add(value);
            }
        System.out.print("Nhap hanh dong: ");
        String q = sc.next();
        if (q.equals("Insert")){
            System.out.println("Nhap stt va gia tri muon nhap: ");
            int x  = sc.nextInt();
            int y = sc.nextInt();
            arrayList.add(x,y);
        }
        else if (q.equals("Delete")){
            System.out.print("Nhap stt cua so muon xoa: ");
            int x = sc.nextInt();
            arrayList.remove(x);
        }
        System.out.println(arrayList);




    }
}
