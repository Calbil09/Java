//package s2java.src.TP4;
import java.util.Scanner;
public class EX1 {
   public static void main(String[] args) {
       primenumber prime;
       Scanner input = new Scanner(System.in);
       System.out.println("Input number to check whether it is prime number: ");
       prime = new primenumber(input.nextInt());
       if(prime.isprime()){
           System.out.printf("%d is a prime number .\n", prime.number);
       }else 
           System.out.printf("%d is not a prime number , "+"because it is divisible by %d\n", prime.number, prime.divisible);
   }
}