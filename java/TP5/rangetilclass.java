//package s2java.src.TP5;
import java.util.Scanner;

public class rangetilclass {
    int start;
    int end;
    int step;

    rangetilclass(int start, int end, int step){
        this.start = start;
        this.end = end;
        this.step = step;
    }
    
    @Override
    public String toString(){
        String str = "";
        if(start<end){
            for(Integer i=start; i<=end; i=i+step){
            str = str + i.toString();
            if (i+step<=end) str = str + ", ";
            }
            return str;
        }
        else{
            for(Integer i=start; i<=end; i=i-step){
                str = str + i.toString();
                if (i+step<=end) str = str + ", ";
            }
            return str;
        }
    }
}
class NewOddNumber{
    public static void main(String[] args) {
        rangetilclass r1 = new rangetilclass(1, 500, 2);
        String s1 = r1.toString();
        System.out.println(s1 + " are odd numbers between 0 and 500.");
    }
}

class NewEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to display even number between A-500.");
        System.out.print("Input A(0<A<500): ");
        int a = sc.nextInt();
    
        if(a%2==1) a++;
        if(a<0 || a>500) System.out.println("A must be between 0 and 500.!!");
        else{
            rangetilclass r1 = new rangetilclass(a, 500, 2);
            String s1 = r1.toString();
            
            System.out.println(s1 + " are even numbers between " + a + " and 500.");
        }
        sc.close();
    }
 
}