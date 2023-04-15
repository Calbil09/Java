package s2java.src.TP5;
import java.util.Scanner;
public class AllEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        while (true) {
            System.out.println("""
                    
            -------- Menu ---------
            1. Prime number
            2. Odd number
            3. Even number
            4. Company Profit
            5. Palindrome
            6. String Mirror
            7. Escape Characters Replacement
            0. Exit""");
            
            System.out.print("Enter an option: ");
            if (input.hasNextInt()) {
                option = input.nextInt();
                switch (option) {
                    case 1:
                        prime.main(args);
                        break;
                    case 2:
                        oddnumber.main(args);
                        break;
                    case 3:
                        Evennumber.main(args);
                        break;
                    case 4:
                        companyporfit.main(args);
                        break;
                    case 5:
                        palindrome.main(args);
                        break;
                    case 6:
                        stringmirror.main(args);
                        break;
                    case 7:
                        EscCharRep.main(args);
                        break;
                    case 0:
                    default:
                        System.out.println("Thank You");
                        input.close();
                        System.exit(0);
                        break;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer option.");
                input.next(); // consume non-integer input
            }
        }        
}
}