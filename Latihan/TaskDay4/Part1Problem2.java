import java.util.Scanner;

public class Part1Problem2 {
    private static int pangkat(int x, int n)
    {
        int temporary;
        if( n == 0)
            return 1;
        temporary = pangkat(x, n/ 2);

        if (n % 2 == 0)
            return temporary*temporary;
        else
            return x*temporary*temporary;
    }

    public static void main(String[] args){
        Scanner myInput = new Scanner( System.in );
        int x, n;
        System.out.print("x = ");
        x = myInput.nextInt();
        System.out.print("n = ");
        n = myInput.nextInt();
        System.out.println(pangkat(x, n));
    }
}
