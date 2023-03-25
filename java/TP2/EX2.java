package s2java.src.TP2;
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Please Input width (In meter) : ");
        int x = in.nextInt();
        System.out.println("please input height (in meter): ");
        int y= in .nextInt();
        int perimeter = (x+y)*2 ;
        int surface = x*y;
        System.out.println("Perimeter = ( "+x+" + "+y+" )*2 = "+perimeter);
        System.out.println("Surface = "+x+" + "+y+" = "+surface+" m^2");

    }
    
}
