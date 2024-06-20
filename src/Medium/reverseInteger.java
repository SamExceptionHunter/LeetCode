package Medium;

public class reverseInteger {
    public int reverse(int x) {
        int reversed=0,digit;

        while(x!=0){
            digit=x%10;
        if(reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)){
            return 0;
        }
        else if(reversed<Integer.MIN_VALUE/10||(reversed==Integer.MIN_VALUE/10 && digit<-8)){
            return 0;
        }
        reversed=reversed*10+digit;
        x=x/10;
    }
        return reversed;
}}
