import java.util.Scanner;

public class longestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String res = findPalindrome(input);
        System.out.println(res);
    }
    // from the center expand and compare characters for palindrome.
    public static String findPalindrome(String input){
        if(input.length() <= 1) return input;
        String longest = input.substring(0,1);
        for(int i = 0; i < input.length();i++){
            String temp = expand(input,i,i);
            if(temp.length() > longest.length()){
                longest = temp;
            }
            temp = expand(input,i,i+1);
            if(temp.length() > longest.length()){
                longest = temp;
            }
        }
        return longest;
    }
    // function to start from the pointers and continually compare characters.
    public static String expand(String input, int begin, int end){
        while(begin >= 0 && end <= input.length() -1 && input.charAt(begin) == input.charAt(end)){
            begin--;
            end++;
        }
        return input.substring(begin+1,end);
    }

}

