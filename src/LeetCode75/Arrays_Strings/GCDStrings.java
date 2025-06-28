package LeetCode75.Arrays_Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Step1: check if str1 + str2 = str2 + str1
 * Step2: Calculate the GCD of the two strings str1, str2
 * Step3: Return the substring of the either string from 0 to gcd
 */
public class GCDStrings {

    public int gcd(int x, int y){
        if(y==0)
            return x;
        else
            //noinspection SuspiciousNameCombination
            return gcd(y,x%y);
    }

    public String gcdOfStrings(String str1, String str2) {

        if(!((str1 + str2).equals(str2 + str1)))
            return "";

        int gcdLength = gcd(str1.length(), str2.length());

        return str1.substring(0,gcdLength);
    }

    public static void main(String[] args){
        Map<String,String> Testcases = new HashMap<>();
        Testcases.put("ABCABC","ABC");
        Testcases.put("ABABAB","ABAB");
        Testcases.put("LEET","CODE");
        GCDStrings gcdStrings = new GCDStrings();
        for(String key : Testcases.keySet()) {
            System.out.println("Str1 = "+key+" Str2 = "+Testcases.get(key));
            System.out.println(gcdStrings.gcdOfStrings(key, Testcases.get(key)));
        }
    }
}
