package exeptionHandling;

public class exeptionHandling {
    public static void main(String[] args) {

        int arr[] = new int[5];
        try{
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);
        }catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        int zero = 0;
        try {
            int average = 10 / zero;
            System.out.println("Average = " + average);
        }catch (ArithmeticException a)
        {
            System.out.println("Can't divide");
        }

        try{
            String obj = null;
            System.out.println(obj.length());
        } catch (NullPointerException n)
        {
            System.out.println(n);
        }

        System.out.println("Finished!");
    }

}
