package s2java.src.TP5;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check Prime Number");
        final int start = 2;
        System.out.println("Enter final number x: ");
        int m = input.nextInt();

        System.out.print("List of prime numbers from " + start + " to " + m + ": ");
        for (int i = start; i <= m; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
