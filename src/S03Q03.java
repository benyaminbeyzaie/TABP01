import java.util.Scanner;

public class S03Q03 {
    static int counter = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] rows = new int[n];
        int[] columns = new int[n];
        int[] diagonals = new int[2 * n];
        int[] reverseDiagonals = new int[2 * n];
        System.out.println(solve(rows, columns, diagonals, reverseDiagonals,  n, 0));
    }

    private static int solve(int[] rows, int[] columns, int[] diagonals, int[] reverseDiagonals, int n, int currentColumn) {
        if (currentColumn >= n) counter++;
        else for (int i = 0; i < n; i++) {
            if (rows[i] != 1 && columns[currentColumn] != 1 && diagonals[n + i - currentColumn - 1] != 1 && reverseDiagonals[i + currentColumn] != 1) {
                rows[i] = 1;
                columns[currentColumn] = 1;
                diagonals[n + i - currentColumn - 1] = 1;
                reverseDiagonals[i + currentColumn] = 1;
                solve(rows, columns, diagonals, reverseDiagonals, n, currentColumn + 1);
                rows[i] = 0;
                columns[currentColumn] = 0;
                diagonals[n + i - currentColumn - 1] = 0;
                reverseDiagonals[i + currentColumn] = 0;
            }
        }
        return counter;
    }
}
