package LeetCode75.Arrays_Strings;

import java.util.Arrays;

public class Problem7 {
    public int[] productExceptSelf(int[] nums) {
        int product = 1, zeros = 0;
        for (int num : nums) {
            product *= num;
            if (num==0)
                zeros++;
        }
        int[] answer = new int[nums.length];
        if(zeros>1)
            return answer;
        if(zeros==1){
            product = 1;
            int zeroIndex = 0;
            for (int i=0;i<nums.length;i++){
                if(nums[i]!=0)
                    product *= nums[i];
                else zeroIndex=i;
            }
            answer[zeroIndex] = product;
        }
        else{
            for (int i=0;i<nums.length;i++){
                if(nums[i]!=0)
                    answer[i] = product / nums[i];
            }
        }
        return answer;
    }

    public int[] productExceptSelfOptimal(int[] nums) {
        int[] res = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= product;
            product *= nums[i];
        }
        return res;
    }

    public static void main(String[] a){
        Problem7 problem7 = new Problem7();
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(problem7.productExceptSelf(nums)));
        System.out.println(Arrays.toString(problem7.productExceptSelfOptimal(nums)));
    }
}
