import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Part1Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        String input = scan.nextLine();

        HashMap<Integer, Integer> muncul = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int num = Character.getNumericValue(c);
            if (!muncul.containsKey(num)) {
                muncul.put(num, 1);
            }
            else {
                muncul.put(num, muncul.get(num) + 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> kPair:
                muncul.entrySet()) {
            if (kPair.getValue().equals(1)){
                ans.add(kPair.getKey());
            }
        }
        System.out.println(ans);
    }
}
