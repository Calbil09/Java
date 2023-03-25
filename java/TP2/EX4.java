package s2java.src.TP2;
import java.util.Scanner;
public class EX4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program for counting the number of hundreds.");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int result = number /100;
        System.out.println("There are " +result+ " hundreds in Number "+ number);

    }
}
