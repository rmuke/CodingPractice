package Miscellenious;

public class CountEvenAndOddNumberInGivenRange {

    public static void main(String[] args) {
        countEvenAndOddNumbers(3,10);
    }

    private static void countEvenAndOddNumbers(int l, int r) {

        int N= r-l +1;

        if(N%2 == 0){
            System.out.println("even :"+N/2+",odd :"+N/2);
        }else{
            if(l%2 !=0 || r%2 != 0){
                System.out.println("odd :"+((N/2)+1)+", even :"+(N-((N/2)+1)));
            }else{
                System.out.println("odd :"+((N/2)+", even :"+(N-((N/2)+1))));
            }
        }
    }
}
