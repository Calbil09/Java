package s2java.src.TP2;
import java.util.Scanner;
public class EX5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program for guessing your luckiness. ");
        System.out.print("Enter your lucky number: ");
        int luckyNumber = input.nextInt();
        luckyNumber +=1;
        System.out.println("I got "+ luckyNumber+". I am luckier. ");
    }
}
