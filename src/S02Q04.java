import java.util.Scanner;

public class S02Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] A = new long[1010];
        long[] B = new long[1010];
        A[0] = 1;
        for (int i = 0; i < n; i++) {
            // print space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // print row
            for (int j = 0; j <= i; j++) {
                System.out.print(A[j] + " ");
            }
            // calculate next row
            B[0] = 1;
            for (int j = 1; j <= i + 1; j++) {
                B[j] = (A[j - 1] + A[j]) % 10;
            }
            for (int j = 0; j <= i + 1; j++) {
                A[j] = B[j];
            }
            System.out.println();
        }
    }
}
/*
     1
    1 1
  1 3 3 1 0
 1 4 6 4 1
1 5 0 0 5 1
 */
