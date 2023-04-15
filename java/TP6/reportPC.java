import java.util.Scanner;
public class reportPC {
    public static void main(String[] args) {
        PC[] pcs = new PC[] {
            new PC("PC1"),
            new PC("PC2"),
            new PC("PC3"),
            new PC("PC4"),
            new PC("PC5"),
            new PC("PC6"),
            new PC("PC7"),
            new PC("PC8"),
            new PC("PC9"),
            new PC("PC10")
        };
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. List all PCs");
            System.out.println("2. List all damaged PCs");
            System.out.println("3. List all good PCs");
            System.out.println("4. Mark a PC as damaged");
            System.out.println("5. Mark a PC as not damaged");
            System.out.println("6. Quit");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("All PCs:");
                for (PC pc : pcs) {
                    System.out.println(pc.getName());
                }
            } else if (choice == 2) {
                System.out.println("Damaged PCs:");
                for (PC pc : pcs) {
                    if (pc.isDamaged()) {
                        System.out.println(pc.getName());
                    }
                }
            } else if (choice == 3) {
                System.out.println("Good PCs:");
                for (PC pc : pcs) {
                    if (!pc.isDamaged()) {
                        System.out.println(pc.getName());
                    }
                }
            } else if (choice == 4) {
                System.out.println("Enter the name of the PC to mark as damaged:");
                String pcName = input.next();
                for (PC pc : pcs) {
                    if (pc.getName().equals(pcName)) {
                        pc.markAsDamaged();
                        System.out.println("Marked " + pcName + " as damaged.");
                    }
                }
            } else if (choice == 5) {
                System.out.println("Enter the name of the PC to mark as not damaged:");
                String pcName = input.next();
                for (PC pc : pcs) {
                    if (pc.getName().equals(pcName)) {
                        pc.markAsNotDamaged();
                        System.out.println("Marked " + pcName + " as not damaged.");
                    }
                }
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
