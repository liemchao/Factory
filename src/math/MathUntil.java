package math;
public class MathUntil {
    public long factorial(long number){
        long result = 0;
        if(number<=0)
            return 0;
        else if(number==1)
            return 1;
        if(number>1){
            result = number*factorial(number-1);
        }
        return result;
    }
}
