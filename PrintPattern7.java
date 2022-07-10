import java.util.Scanner;

/*

Printing Pattern:

*****
 ****
  ***
   **
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
            int totalCol = n-i;
            for (int j = 1; j <=(n-1)-totalCol; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=totalCol+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
