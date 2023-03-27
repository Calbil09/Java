//package s2java.src.TP4;
import java.util.Scanner;
public class Manu {
    public void Menu() {
        System.out.println("""
            -------- Menu ---------
            1. Prime number
            2. Lucky number
            3. Reversing number
            4. Money EXchange
            5. Max among 8 numbers
            6. Shipping
            7. Leap year
            0. EXit""");
    }
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        Manu tr = new Manu();
        do {
            tr.Menu();
            System.out.print("Choose an option: ");
            option = sc.nextInt();
            switch(option) {
                case 1: EX1.main(args);
                    break;
                case 2: EX2.main(args);
                    break;
                case 3:EX3.main(args);
                    break;
                case 4:EX4.main(args);
                    break;
                case 5: EX5.main(args);
                    break;
                case 6:EX6.main(args);
                    break;
                case 7: EX7.main(args);
                    break;
                case 0:
                    System.out.println("Thank you!\n");
                    System.exit(0);
                    break;
            }        
        }while(option != 0);
    }
}
