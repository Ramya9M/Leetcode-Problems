package Strings;

import java.util.HashSet;
import java.util.Set;

public class longestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        int i = 0;
        int j = 0;

        Set<String> hash_set = new HashSet<String>();
        int max_len = 0;

        while(j!=s.length()){

            while(hash_set.contains(Character.toString(s.charAt(j))) && i<j){
                hash_set.remove(s.charAt(i));
                i++;
            }

            int length = j-i+1;
            hash_set.add(Character.toString(s.charAt(j)));
            max_len = length>max_len ? length:max_len;
            j++;
        }
        return max_len;
    }

    public static void main(String args[]){

        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
