import java.util.Locale;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jmlVokal, jmlKonsonan, total;
        jmlVokal = jmlKonsonan = total = 0;

        String input = scan.nextLine();
        String lowInput = input.toLowerCase();
        for(char c : lowInput.toCharArray()) {
            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
                jmlVokal += 1;
            } else if(c == ' ') {
                jmlVokal += 0;
                jmlKonsonan += 0;
            }else{
                jmlKonsonan += 1;
            }
        }
        total = jmlVokal + jmlKonsonan;
        System.out.println("Jumlah Vokal: " + jmlVokal);
        System.out.println("Jumlah Konsonan: " + jmlKonsonan);
        System.out.println("Total Karakter: " + total);
    }
}
