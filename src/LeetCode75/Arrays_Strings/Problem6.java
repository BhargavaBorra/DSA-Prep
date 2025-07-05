package LeetCode75.Arrays_Strings;

import java.util.List;
import java.util.Stack;

public class Problem6 {
    public String reverseWords(String s) {
        List<String> words = List.of(s.trim().split(" "));
        StringBuilder sb = new StringBuilder();
        for(int i= words.size()-1;i>=0;i--)
            if(!words.get(i).isEmpty())
                sb.append(words.get(i)).append(" ");
        return sb.toString().trim();
    }

    public String reverseWordsStack(String s) {
        s=s.trim();
        Stack<String> temp = new Stack<>();
        int j=0;
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i)==' ' && !s.substring(j, i).trim().isEmpty()) {
                temp.push(s.substring(j, i).trim());
                j=i++;
            }
        temp.push(s.substring(j).trim());
        StringBuilder sb = new StringBuilder();
        while (!temp.isEmpty())
            sb.append(temp.pop()).append(" ");
        return sb.toString().trim();
    }

    public String reverseWords2P(String s) {
        String[] words = s.split(" ");
        int i=0,j=words.length-1;
        while (i<j){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++; j--;
        }
        StringBuilder sb = new StringBuilder();
        for(String word: words){
            if(!word.isEmpty())
                sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] a){
        Problem6 problem6 = new Problem6();
        System.out.println(problem6.reverseWords("a good   example"));
        System.out.println(problem6.reverseWordsStack("a good   example"));
        System.out.println(problem6.reverseWords2P("a good   example"));

    }
}
