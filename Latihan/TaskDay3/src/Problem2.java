import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int jmlX, jmlO;
        jmlX=jmlO=0;
        boolean isSame = false;

        for(char c : input.toCharArray()){
            if(c == 'x'){
                jmlX += 1;
            }else if(c == 'o'){
                jmlO += 1;
            }
        }
        if(jmlX == jmlO){
            isSame = true;
        }
        System.out.println(isSame);
    }
}
