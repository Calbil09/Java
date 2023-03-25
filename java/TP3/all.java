package s2java.src.TP3;

import java.util.Scanner;
public class all {
    static Scanner  input =new Scanner(System.in);
    public static void main(String[] args) {
        String  option;
        while(true){
        System.out.println("-------- Menu --------- ");
        System.out.println("1. Seconds to Time  \n2. Time to Seconds  \n3. Calling Cost  \n4. Riels to Dollar \n5. Traveling Duration  \n0. Exit ");
        System.out.print("Chosse an option : ");
        option =input.next();
        System.out.println("-----------------------");
        switch(option){
            case "1": 
            secondtotime();
            break;
            case "2": 
            timetosecond();
            break;
            case "3": 
            callingcost();
            break;
            case "4": 
            reiltodollar();
            break;
            case "5": 
            travelduration();
            break;
            case "0":
            System.exit(0);
            default:
	                 System.out.println("invalid operation");
        }
    }
}
    static void secondtotime(){
        System.out.println("Input number of seconds : ");
        int second = input.nextInt();
        int hour = second / 3600;
        int minute = (second % 3600) / 60;
        int Second = second % 60;
        System.out.println(" "+hour+" : "+minute+" : "+Second);
    }
    static void timetosecond(){
        System.out.println("Program for converting time to seconds.");
        System.out.print("please input Hours: ");
        int hours=input.nextInt();
        System.out.print("Please input minutes : "); 
        int minutes=input.nextInt();
        System.out.print("please input seconds : ");
        int seconds=input.nextInt();
        int h =hours * 3600;
        int m =minutes * 60;
        int s =seconds;
        int result = h+m+s;
        System.out.println("Number of seconds :"+hours+" x 3600 , "+ minutes+" x 60 "+seconds+" x 60 : "+result);
    }
    static void callingcost(){
        System.out.println("Program for calculating cost of a call ");
        //get start time
        System.out.print("please input Hours: ");
        int shours=input.nextInt();
        System.out.print("Please input minutes : "); 
        int sminutes=input.nextInt();
        System.out.print("please input seconds : ");
        int sseconds=input.nextInt();
        //get end time
        System.out.println("\n------------------------------------\n");
        System.out.print("please input Hours: ");
        int ehours=input.nextInt();
        System.out.print("Please input minutes : "); 
        int eminutes=input.nextInt();
        System.out.print("please input seconds : ");
        int eseconds=input.nextInt();
        System.out.println("---------------------------------------");
        int second = eseconds-sseconds;
        int durations=  (ehours-shours)*3600+(eminutes-sminutes)*60+second;
        double result= (durations  * 0.05/60) ;
        System.out.printf(" Total Call Duration: %d h %d m %d s %n" ,durations/3600,durations/60,(60+second));
        System.out.printf(" Total Call Costs : %.4f$%n",result );
    }
    static void reiltodollar(){
        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.println("Converting rate is 1$ = 4000 reils");
        System.out.println("please input money in Riels: ");
        int r = input.nextInt();
        double result = r / 4000.0;
        System.out.println(" "+r+" = "+result+" USD");
    }
    static void travelduration(){
        final int DISTANCE = 7;
        final int speed = 30;

        System.out.print("Program for calculating duration of travel from ITC to Airport.\nPlease input traffic jam factor (in percentage [0-100]): ");
        int factor = input.nextInt();

        double adjustedSpeed = speed * (1 - (factor / 100.0));
        int inseconds = (int) ((DISTANCE / adjustedSpeed) * 3600);

        int hours = inseconds / 3600;
        int minutes = (inseconds % 3600) / 60;
        int seconds = inseconds % 60;

        System.out.printf("travel Duration : %02d:%02d:%02d\n", hours, minutes, seconds);

    }
}
