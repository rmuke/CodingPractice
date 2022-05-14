package Miscellenious;

public class ReverseNumbers {

    public static void main(String[] args) {

        System.out.println(reverseNumber(-1230));
    }

    public static int reverseNumber(int num) {
        long res = 0;
        while(num!=0){
            res = res * 10 + num %10;
            num = num/10;
        }
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int)res;
    }
}
