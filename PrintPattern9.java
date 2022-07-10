import java.util.Scanner;

/*

Printing Pattern:

    *********
     *******
      *****
       ***
        *

*/

public class PrintPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        PrintGivenPattern(n);
        input.close();
    }

    static void PrintGivenPattern(int n){
        // Print outer loop for rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*n-1)-(2*(i-1)); j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
