import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Part1Problem3 {
    private static HashSet<String> ArrayMerge(ArrayList<String> list1, ArrayList<String> list2) {
        HashSet<String> merged = new HashSet<>(list1);
        for (String str:
             list2) {
            merged.add(str);
        };
        return merged;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line1 = scan.nextLine();
        String line2 = scan.nextLine();

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(line1.split(" ")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(line2.split(" ")));

        System.out.println(ArrayMerge(list1, list2));
    }
}
