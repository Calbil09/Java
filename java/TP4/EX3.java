//package s2java.src.TP4;
import java.util.Scanner;
public class EX3 {
    public int reverseNumber(int num, int digits) {
        int reverseNum = 0;
        int n = digits;
        int a;
        for(int i=0; i<digits; i++) {
            a = (int)Math.pow(10.00,(n-1));
            reverseNum = reverseNum + (num%10)*a;
            num/=10;
            n--;
        }
        return reverseNum;
    }
    public static void main(String[] args) {
        int number, reverseNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("         >>>>Reversing Number<<<<        ");
        System.out.println("----------------------------------------");
        System.out.println("Program for reversing a 4 digits number");
        System.out.print("Please input a 4-digit number: ");
        number = sc.nextInt();
        int digits = (int) (Math.log10(number) + 1);

        if (digits != 4) {
            System.out.println("\nError: Invalid input number, please input only a 4-digit number.");
        } else {
            EX3 ex = new EX3();
            reverseNumber = ex.reverseNumber(number, 4);
            System.out.println("\nAfter reversing: " + reverseNumber);
        }
        System.out.println("----------------------------------------");
    }
}
