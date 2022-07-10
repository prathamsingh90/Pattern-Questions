import java.util.Scanner;

/* 

Printing pattern:

*****
*****
*****

*/

public class PrintPattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        PrintGivenPattern(n);
        input.close();
    }

    static void PrintGivenPattern(int n){
        // Print outer loop for rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
