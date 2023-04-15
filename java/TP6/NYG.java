import java.util.ArrayList;
import java.util.Scanner;
public class NYG {
    String name;
    public int number,price,amount;
    static int choice=0;
    
    public NYG(String name,int number,int price, int amount){
        this.name = name;
        this.number = number;
        this.price = price;
        this.amount = amount;
    }

    static ArrayList<NYG> Product = new ArrayList<>();

    public static void displayPro(){
        if(Product.isEmpty()){
            System.out.println("\nSorry the system is Empty!!");
        }else{
            for(NYG s:Product){
                System.out.printf("\nNumber: %d\nName: %s\nPrice: %d$\nAmount: %d",s.number,s.name,s.price,s.amount);
            }
        }
    }

    public static void AddPro(){
        Scanner inp = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Number: ");
        int a = sc.nextInt();
        System.out.print("Input a Name of the product: ");
        String b = inp.nextLine();
        System.out.print("Input the Price of the product: ");
        int c = inp.nextInt();
        System.out.print("Input the Amount of the product in stock: ");
        int d = inp.nextInt();
        NYG tmp = new NYG(b,a,c,d);
        Product.add(tmp);
    }
    public static void RemovePro(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Input a Product Index: ");
        Product.remove(inp.nextInt()-1);
        System.out.println("\nItem have successfully removed!!");
    }
    static boolean Valid(Integer x){
        for(NYG s:Product){
            if(s.number == x){
                return true;
            }
        }
        return false;
    }
    public static void UpdatePro(){
        Scanner sc = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);
        String[] list = {"Name","Number","Price","Amount"};
        System.out.print("Input the number of the product: ");
        boolean update = false;
        int l = sc.nextInt();
        if(Valid(l)){
            String b="";
            int a=0;
            System.out.println();
            System.out.print(
                """
                1. Name
                2. Number
                3. Price
                4. Amount
                
                Please Choose which data you like to update: """);
            int k = sc.nextInt()-1;
            System.out.print("\nPlease enter a new "+list[k]+" :");
            if(sc.hasNextInt()){
                a = sc.nextInt();
            }else{
                b = inp.nextLine();
            }
            for(NYG s:Product){
                if(s.number == l){
                    if(list[k].equals("Name")){
                        s.name = b;
                        update = true;
                    }
                    else if(list[k].equals("Number")){
                        s.number = a;
                        update = true;
                    }
                    else if(list[k].equals("Price")){
                        s.price = a;
                        update = true;
                    }
                    else if(list[k].equals("Amount")){
                        s.amount = a;
                        update = true;
                    }
                }
            }
            if(update)System.out.println("\n"+list[k]+" have updated!!");
        }
        else System.out.println("\nSorry the item is not in the system!!");
    }
    public static void clearS(){
        System.out.print("\033\143");
        System.out.flush();  
    }
    public static void pause(){
        Scanner inp = new Scanner(System.in);
        System.out.println("\n(Press enter to continue)");
        inp.nextLine();
    }
    static public void displayMenu(){
        Scanner inp = new Scanner(System.in);
        System.out.print(
            """
            -------- Menu -------
            1. List All Product
            2. Add New Product
            3. Remove Product
            4. Update Product
            5. Exit Program

            Please Choose an option: """);
        if(inp.hasNextInt()){
            choice = inp.nextInt();
        }else{
            System.out.println("\nPlease choose an option between 1 to 5");
            pause();
            clearS();
            displayMenu();
        }
    }
    public static void main(String[] args) {
        while(choice!=5){
            clearS();
            displayMenu();
            switch(choice){
                case 1:
                    clearS();
                    displayPro();
                    pause();
                    break;
                case 2:
                    clearS();
                    AddPro();
                    pause();
                    break;
                case 3:
                    clearS();
                    RemovePro();
                    pause();
                    break;
                case 4:
                    clearS();
                    UpdatePro();
                    pause();
                    break;
                case 5:
                    System.err.println("Exiting system...");
                    pause();
                    break;
                default:
                    System.out.println("Please enter the value between 1-5!!");
                    pause();
                    break;
            }
        }
    }
}

