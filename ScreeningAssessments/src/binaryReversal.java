import java.util.Scanner;

public class binaryReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int res = solveReversal(input);
        System.out.println(res);
    }
    public static int solveReversal(int input){

        String binaryInput = Integer.toBinaryString(input);

        String paddedBinaryInput = "";
        //add necessary zeros
        while(paddedBinaryInput.length() + binaryInput.length() < 8){
            paddedBinaryInput += "0";
        }
        paddedBinaryInput += binaryInput;
        // reverse the input binary number
        String reversedBinaryInput = new StringBuilder(paddedBinaryInput).reverse().toString();

        //return the decimal value
        int res = Integer.parseInt(reversedBinaryInput,2);

        return res;
    }
}
