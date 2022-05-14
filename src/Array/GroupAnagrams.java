package Array;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs){

        Map<String,List<String>> map = new HashMap<>();

        for(String str: strs) {

            char[] ca = str.toCharArray();

            Arrays.sort(ca);

            String key = String.valueOf(ca);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(str);
        }
       return new ArrayList<>(map.values());
    }
}
