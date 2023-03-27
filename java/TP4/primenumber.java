//package s2java.src.TP4;
class primenumber {
    int number, divisible =1;
    public primenumber(int number) {
        this.number = number;
    }
    boolean isprime(){
        if(number<=1)return false;
        for (int i=2; i<number; i++){
            if(number%i==0){
                divisible =i;
                return false;
            }
        }
        return true;
    }
}