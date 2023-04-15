package s2java.src.TP5;
import java.util.Scanner;

public class companyporfit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum = 0;
        for (int i = 0; i < 12 ; i++) {	
            System.out.println("Profit for month " +(i+1)+": ");
            float profit = input.nextFloat();
            sum += profit;
        }
        System.out.printf("Total profit: %.2f", sum);
        
    }
}
