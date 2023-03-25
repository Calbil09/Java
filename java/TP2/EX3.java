package s2java.src.TP2;
import java.util.Scanner;
public class EX3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program for calculating equation 1/x = 1/y + 1/z");
        System.out.println("Input y : ");
        float y = in.nextFloat();
        System.out.println("Input z : ");
        float z = in.nextFloat();
        float x =  1/y + 1/z;
        float result = 1/x;
        System.out.println("Result = "+result);
       

    }
}
