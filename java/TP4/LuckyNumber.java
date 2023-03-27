//package s2java.src.TP4;
public class LuckyNumber {
    public int number;
    public int amount;
    public LuckyNumber(int num) {
        this.number = num;
        this.amount = num;
    }
    public boolean Valid(double digits) {
        int a = (int)Math.pow(10.00,(digits-1));
        if(number/a >= 1 && number/a < 10) {
            return true;
        }
        return false;
    }
    public boolean Lucky() {
        int head = 0, tail = 0;
        for(int i=1; i<=6; i++) {
            if (i<=3) {
               tail = tail + number%10;
               number /= 10;
            }
            else {
                head = head + number%10;
               number /= 10;
            }
        }
        if(head == tail) {
            return true;
        }
        return false; 
    }  
}

