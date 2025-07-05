package LeetCode75.Arrays_Strings;

public class Problem5 {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int i=0, j=s.length()-1;
        while (i<j){
            if(isVowel(charArray[i])&&isVowel(charArray[j])){
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            }
            if(!isVowel(charArray[i]))
                i++;
            if(!isVowel(charArray[j]))
                j--;
        }
        return String.valueOf(charArray);
    }
    public boolean isVowel(char a){
        return a =='a' || a =='e' || a =='i' || a =='o' || a =='u' ||
                a =='A' || a =='E' || a =='I' || a =='O' || a =='U';
    }
    public static void main(String[] args){
        Problem5 problem5 = new Problem5();
        System.out.println(problem5.reverseVowels("alie"));
    }
}
