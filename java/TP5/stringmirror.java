package s2java.src.TP5;
import java.util.Scanner;
public class stringmirror {
    public static void main(String[] args) {
        String w;
        String reverse="";
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Enter a word : ");
        w = input.nextLine();
        for (int i = 0; i < w.length(); i++){
            reverse = w.charAt(i)+reverse;
        }
        System.out.println("Result : "+w+reverse);
    }
}
