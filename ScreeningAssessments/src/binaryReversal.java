import java.util.Scanner;

public class binaryReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String res = solveReversal(input);
        System.out.println(res);
    }
    public static String solveReversal(String input){
        StringBuilder newInput = new StringBuilder();
        // append zeroes first
        while(8 - (newInput.length()+input.length()) >= 0){
            newInput.append("0");
            System.out.println("string is "  + newInput + "length is " + newInput.length());
        }
        // now append the real input
        newInput.append(input);

        // then reverse it and return decimal value
        int rev = 0;
        int n = Integer.valueOf(String.valueOf(newInput));
        // traversing bits of 'n'
        // from the right
        while (n > 0)
        {
            // bitwise left shift
            // 'rev' by 1
            rev <<= 1;

            // if current bit is '1'
            if ((int)(n & 1) == 1)
                rev ^= 1;

            // bitwise right shift
            //'n' by 1
            n >>= 1;
        }
        // required number
        System.out.println(rev);
        return "HI";
    }
}
