//package s2java.src.TP4;
import java.util.Scanner;
public class EX2 {
    public int number;
    public int amount;
    public EX2(int num) {
        this.number = num;
        this.amount = num;
    }
    public boolean Valid(double digits) {
        int a = (int)Math.pow(10.00,(digits-1));
        if(number/a >= 1 && number/a < 10) {
            return true;
        }
        return false;
    }
    public boolean Lucky() {
        int head = 0, tail = 0;
        for(int i=1; i<=6; i++) {
            if (i<=3) {
               tail = tail + number%10;
               number /= 10;
            }
            else {
                head = head + number%10;
               number /= 10;
            }
        }
        if(head == tail) {
            return true;
        }
        return false; 
    }  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                --------------------------------------------------
                              >>>>Lucky Number<<<<
                --------------------------------------------------
                """);
        System.out.println("Program for testing for lucky number.");
        System.out.print("Please input 6 digits number: ");
        LuckyNumber luckyNumber =  new LuckyNumber(input.nextInt());
        if(!luckyNumber.Valid(6)) {
            System.out.println("\nInvalid input number, please input only 6 digits number.");
        }
        else if(luckyNumber.Lucky()) {
            System.out.println("\n" + luckyNumber.amount + " is lucky number.");
        }
        else {
            System.out.println("\n" + luckyNumber.amount + " is not lucky number.");
            System.out.println("Try again!");
        }
        System.out.println("==================================================");
    }
}
    