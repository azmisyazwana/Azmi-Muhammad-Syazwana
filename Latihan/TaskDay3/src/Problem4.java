import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        boolean isPrima = false;

        if (input >= 2) {
            for (int i = 2; i <= input; i++) {
                if (input == i) {
                    isPrima = true;
                    break;
                }
                else if (input % i == 0) {
                    break;
                }
            }
        }

        if (isPrima) {
            System.out.println("Bilangan Prima");
        } else {
            System.out.println("Bukan Bilangan Prima");
        }
    }
}
