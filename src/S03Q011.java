import java.util.*;

public class S03Q011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] heights = new int[n][m];
        boolean[][] isReached = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                heights[i][j] = scanner.nextInt();
                isReached[i][j] = false;
            }
        }
        scanner.close();
        int finalAns = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                finalAns = Math.max(finalAns, calculateMost(heights, heights[i][j], i, j, 0));
            }
        }
        System.out.println(finalAns);

    }

    private static int calculateMost(int[][] heights, int currentHeight, int i, int j, int ans) {
        if (i >= heights.length || i < 0)
            return ans;
        if (j >= heights[0].length || j < 0)
            return ans;
        if (ans != 0 && currentHeight >= heights[i][j])
            return ans;

        // isReached[i][j] = true;
        // ans += 1;
        return Math.max(
                Math.max(calculateMost(heights, heights[i][j], i + 1, j, ans + 1),
                        calculateMost(heights, heights[i][j], i, j + 1, ans + 1)),
                Math.max(calculateMost(heights, heights[i][j], i - 1, j, ans + 1),
                        calculateMost(heights, heights[i][j], i, j - 1, ans + 1)));
    }

}
