package LeetCode75.Arrays_Strings;

public class Problem4 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=1, filler=0;
        if(n==0)
            return true;
        if(flowerbed.length==1)
            return flowerbed[0] == 0 && n <= 1;
        if(flowerbed.length==2)
            return flowerbed[0] == 0 && flowerbed[1] == 0 && n<=1;
        if(flowerbed[0]==0 && flowerbed[1]==0){
            filler++;
            flowerbed[0]=1;
        }
        while(i<flowerbed.length-1){
            if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0) {
                filler++;
                flowerbed[i]=1;
            }
            i++;
        }
        if(flowerbed[i-1]==0 && flowerbed[i]==0){
            filler++;
            flowerbed[i]=1;
        }
        return filler >= n;
    }

    public boolean canPlaceFlowersOptimised(int[] flowerbed, int n) {
        int filler=0;
        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i] == 0){
                boolean leftBed = i == 0 || flowerbed[i-1] == 0;
                boolean rightBed = i == flowerbed.length-1 || flowerbed[i+1] == 0;

                if(leftBed && rightBed){
                    flowerbed[i] = 1;
                    filler++;
                    if(filler >= n)
                        return true;
                }
            }
        }
        return filler>=n;
    }
    public static void main(String[] args){
        Problem4 problem4 = new Problem4();
        int[] flowerbed = {0,0};
        int n = 0;
        System.out.println(problem4.canPlaceFlowers(flowerbed,n));
        System.out.println(problem4.canPlaceFlowersOptimised(flowerbed,n));
    }
}