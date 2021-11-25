import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        boolean isPalindrome = false;

        char[] arrayString = input.toLowerCase().toCharArray();

            for(int i = 0; i <= arrayString.length/2; i++){
                if(arrayString[i] != arrayString[arrayString.length-i-1]){
                    isPalindrome = false;
                    break;
                }else{
                    isPalindrome = true;
                }
            }

        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Bukan Palindrome");
        }
    }
}
