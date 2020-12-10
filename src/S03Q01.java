import java.util.Scanner;

public class S03Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[][] matrix = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextLong();
            }
        }
        System.out.println(det(matrix, n));
    }

    private static long det(long[][] a, int n) {
        if (n == 1) {
            return a[0][0];
        }
        long[][] b;
        long result = 0;
        int d = -1;
        for (int k = 0; k < n; k++) {
            d *= -1;
            b = createMatrix(a, n, k);
            result += d * a[0][k] * det(b, n - 1);
            result %= 1000000007;
        }
        return result;
    }

    private static long[][] createMatrix(long[][] a, int size, int k) {
        long[][] b = new long[size - 1][size - 1];
        int c;
        for (int i = 0; i < size - 1; i++) {
            c = 0;
            for (int j = 0; j < size - 1; j++, c++) {
                if (c == k) {
                    j--;
                    continue;
                }
                b[i][j] = a[i + 1][c];
            }
        }
        return b;
    }
}