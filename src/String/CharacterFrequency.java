package String;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static void main(String[] args) {
//        characterFrequency("geeksforgeeks");
        characterFrequencyDP("geeksforgeeks");
    }

    private static void characterFrequencyDP(String str){

        int n = str.length();

        int[] freq = new int[26];

        for(int i=0;i<n;i++){
            freq[str.charAt(i)-'a']++;
        }

        for(int i=0;i<n;i++){

            if(freq[str.charAt(i)-'a'] != 0){

                freq[str.charAt(i)-'a']=0;
            }

        }
    }


    private static void characterFrequency(String geeksforgeeks) {

        Map<Character,Integer> map = new HashMap<>();

        for(char ch : geeksforgeeks.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        for(char ch : geeksforgeeks.toCharArray()){
            System.out.println(ch +""+  map.get(ch)+" ");
        }
    }

}
