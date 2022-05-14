package String;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class StringToInteger {

    public static void main(String[] args) {

        System.out.println(atoi("-12349898979070979807986986"));

    }

    public static int atoi(String s) {

        int start =0,len = s.length(),sign = 1;
        long sum = 0;

        char firstChar = s.charAt(0);

        if(firstChar == '+'){
            sign = 1;
            start++;
        }

        if(firstChar == '-'){
            sign = -1;
            start++;
        }

        for(int i= start;i<len;i++){

            if(!Character.isDigit(s.charAt(i))){
                return (int)sum * sign;
            }

            sum = sum * 10 + s.charAt(i)-'0';

            if(sign == 1 && sum > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            if(sign == -1 && (-1) * sum < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }

        return (int)sum * sign;
    }
}
