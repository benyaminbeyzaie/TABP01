import java.util.Scanner;

public class S02Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[] numbers = new long[n];
        numbers[0] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            numbers[i] = scanner.nextInt();
            numbers[i] += numbers[i - 1];
        }
        // int sum;
        int start;
        int end;
        int sum;
        long[] sums = new long[m];
        for (int i = 0; i < m; i++) {
            start = scanner.nextInt();
            end = scanner.nextInt();
            if (start == 1){
                sums[i] = numbers[end - 1];
            }else {
                sums[i] = numbers[end - 1] - numbers[start - 2];
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(sums[i]);
        }
    }
}
/*

________ //
____sum____ // // TT@2566
____sum____ //    TT@2567
________
________
.
.
.
________


 */
