import java.util.Scanner;

public class Part1Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        double akarInput = Math.sqrt(input);
        boolean isPrima = true;

        if (input >= 2) {
            for (int i = 2; i <= akarInput; i++) {
                if (input % i == 0) {
                    isPrima=false;
                    break;
                }
            }
        }else{
            isPrima=false;
        }

        if (isPrima) {
            System.out.println("Bilangan Prima");
        } else {
            System.out.println("Bukan Bilangan Prima");
        }
    }
}
