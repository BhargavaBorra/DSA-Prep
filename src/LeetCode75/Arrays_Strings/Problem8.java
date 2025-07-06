package LeetCode75.Arrays_Strings;

public class Problem8 {
    public boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;
        for(int n : nums){
            if(n<=i)
                i=n;
            else if(n<=j)
                j=n;
            else
                return true;
        }
        return false;
    }
    public static void main(String[] a){
        Problem8 problem8 = new Problem8();
        int[] nums = {20,100,10,12,5,13};
        System.out.println(problem8.increasingTriplet(nums));
    }
}
