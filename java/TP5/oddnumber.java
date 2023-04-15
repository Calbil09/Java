package s2java.src.TP5;
//package s2java.src.TP5;
import java.util.Scanner;

public class oddnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number x1: ");
        int n = input.nextInt();

        System.out.println("Enter number x2: ");
        int m = input.nextInt();

        System.out.print("List of Odd numbers from " + n + " to " + m + ": ");
        for (int i = n; i <= m; i++) {
            if ((i % 2) > 0) {
                System.out.print(i + " ");
            }
        }
    }
}

