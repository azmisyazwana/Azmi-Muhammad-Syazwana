import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        if(input >= 1){
            for(int i = 1; i <= input; i++){
                if(input % i == 0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Input tidak valid");
        }
    }
}
