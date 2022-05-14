package String;

public class CyclicOrNot {

    public static void main(String[] args) {
        System.out.println(isCyclic("abcde","cdeab"));
    }

    private static boolean isCyclic(String str1, String str2) {

        return str1.length()==str2.length() && (str1+str1).contains(str2);


    }


}
