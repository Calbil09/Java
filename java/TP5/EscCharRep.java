package s2java.src.TP5;
import java.util.Scanner;
public class EscCharRep {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        String replaced = sentence.replaceAll("\\\\n", "(new_line)")
                                   .replaceAll("\\\\t", "(tab)")
                                   .replaceAll("[\\\\][\\\\]", "(slash)")
                                   .replaceAll("//", "(comment_line)")
                                   .replaceAll(":\\)", "(smile)");
        System.out.println(replaced);
        input.close();
    }   
}
