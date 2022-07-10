import java.util.Scanner;

/*

Printing Pattern:

1
12
123
1234
12345

*/

public class PrintPattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        PrintGivenPattern(n);
        input.close();
    }

    static void PrintGivenPattern(int n){
        // Print outer loop for rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
