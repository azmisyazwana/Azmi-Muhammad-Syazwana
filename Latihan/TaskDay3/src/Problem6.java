import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("x = ");
        int x = scan.nextInt();
        System.out.print("n = ");
        int n = scan.nextInt();

        int sum = 1;

        for(int i = 1; i <= n; i++){
            sum = sum * x;
        }
        System.out.println(sum);
    }
}
