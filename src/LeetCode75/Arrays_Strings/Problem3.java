package LeetCode75.Arrays_Strings;

import java.util.*;

/**
 * Step1: Find the max candies in all kids
 * Step2: if candy + extraCandies >= maxCandies, add true, else add false to the new list respectively
 */
public class Problem3 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greatestCandies = new ArrayList<>();
        int maxCandies =0 ;
        for (int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies)
                greatestCandies.add(true);
            else
                greatestCandies.add(false);
        }
        return greatestCandies;
    }

    public static void main(String[] args){
        Problem3 problem3 = new Problem3();
        int[] candies = {12,1,12};
        int extraCandies = 10;
        List<Boolean> Output = problem3.kidsWithCandies(candies,extraCandies);
        System.out.print("[");
        for(boolean key : Output)
            System.out.print(key+",");
        System.out.println("]");
    }
}
