package s2java.src.TP4;
import java.util.Scanner;
public class EX5 {
    public int maxNum(int number, int digits) {
        int max = 0;
        for(int i=0; i<digits; i++) {
            int n = number % 10;
            number /= 10;
            if(n > max) {
                max = n;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        EX5 ex5 = new EX5();
        System.out.println("----------------------------------------");
        System.out.println("        >>>>Finding Maximum Number<<<<   ");
        System.out.println("----------------------------------------");
        System.out.println("Program for finding the maximum of an 8-digit number");
        System.out.print("Please input an 8-digit number: ");
        number = sc.nextInt();
        int digits = (int) (Math.log10(number) + 1);

        if (digits != 8) {
            System.out.println("\nError: Invalid input number, please input only an 8-digit number.");
        } else {
            System.out.println("\nThe maximum digit: " + ex5.maxNum(number, 8));
        }
        System.out.println("----------------------------------------");
    }
}
