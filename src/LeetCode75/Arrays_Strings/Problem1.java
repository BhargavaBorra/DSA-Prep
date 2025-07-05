package LeetCode75.Arrays_Strings;

public class Problem1 {
    public String mergeAlternately2ptrs(String word1, String word2) {
        int i=0 ,j=0;
        StringBuilder concatination = new StringBuilder();
        while(i< word1.length() || j<word2.length()){
            if(i<word1.length())
                concatination.append(word1.charAt(i++));
            if(j<word2.length())
                concatination.append(word2.charAt(j++));
        }
        return concatination.toString();
    }

    public String mergeAlternately1ptr(String word1, String word2) {
        StringBuilder concatination = new StringBuilder();
        for(int i=0;i<Math.max(word1.length(),word2.length());i++){
            if(i<word1.length())
                concatination.append(word1.charAt(i));
            if(i<word2.length())
                concatination.append(word2.charAt(i));
        }
        return concatination.toString();
    }

    public static void main(String[] args){
        String word1="abcd";
        String word2="pq";
        Problem1 msa = new Problem1();
        System.out.println(msa.mergeAlternately2ptrs(word1,word2));
        System.out.println(msa.mergeAlternately1ptr(word1,word2));
    }
}
