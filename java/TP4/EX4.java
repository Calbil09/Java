//package s2java.src.TP4;
import java.util.Scanner;

public class EX4 {
    public double amount;
    public EX4(double amount) {
        this.amount = amount;
    }
    public double reilsToUsd() {
        double usd;
        usd = amount/4100.00;
        return usd;
    }
    public double bahtsToReils() {
        double riels;
        riels= amount/34.00*4100.00; 
        return riels;
    }
    public double usdToReils() {
        double riels;
        riels = 4100.00*amount;
        return riels;
    }
    public double usdToBaht() {
        double baht;
        baht = 34.00*amount;
        return baht;
    }
    public void menu() {
        System.out.print("""
            Welcome to program Money Exchanges!
            1. Riels to Dollar
            2. Riels to Thai Baht
            3. Dollar to Riels
            4. Dollar to Thai Baht
            5. Thai Baht to Riels
            6. Exit
            ----------------------------------------------------------------
                """);
    }
    public void moneyExchanges(int option) {
        double currency,amount;
        Scanner sc = new Scanner(System.in);
        EX4 EX4;
        switch(option) {
            case 1:
                System.out.print("Input money in RIELS: ");
                amount = sc.nextDouble();
                EX4 = new EX4(amount);
                currency = EX4.reilsToUsd();
                System.err.printf("\n%.0f REILS = %.2f USD\n", amount, currency);
                break;
            case 2:
                System.out.print("Input money in RIELS: ");
                amount = sc.nextDouble();
                EX4 = new EX4(amount);
                currency = EX4.reilsToUsd();
                EX4 = new EX4(currency);
                currency = EX4.usdToBaht();
                System.err.printf("\n%.0f REILS = %.2f BAHTs\n", amount, currency);
                break;
            case 3:
                System.out.print("Input money in USD: ");
                amount = sc.nextDouble();
                EX4 = new EX4(amount);
                currency = EX4.usdToReils();
                System.err.printf("\n%.2f USD = %.0f REILS\n", amount, currency);
                break;
            case 4:
                System.out.print("Input money in USD: ");
                amount = sc.nextDouble();
                EX4 = new EX4(amount);
                currency = EX4.usdToBaht();
                System.err.printf("\n%.2f USD = %.2f BAHTS\n", amount, currency);
                break;
            case 5:
                System.out.print("Input money in BAHTS: ");
                amount = sc.nextDouble();
                EX4 = new EX4(amount);
                currency = EX4.bahtsToReils();
                System.err.printf("\n%.0f BAHTS = %.0f RIELS\n", amount, currency);
                break;
            default :
                System.out.println("Thanks for using our programs!");
        }
    }
    public static void main(String[] args) {
        int option;
        EX4 EX4 = new EX4(0);
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                --------------------------------------------------
                	        >>>>Money Exchanges<<<<
                --------------------------------------------------
                """);
        EX4.menu();
        System.out.print("Choose an option: ");
        option = sc.nextInt();
        EX4.moneyExchanges(option);
        System.out.println("--------------------------------------------------");
    }
}