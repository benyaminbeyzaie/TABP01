import java.util.Scanner;

public class S03Q02 {
    static String moves = "";
    static int ans = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        hanoi(n, 'A', 'B', 'C');
        System.out.println(ans);
        System.out.println(moves);
    }

    private static void hanoi(int n, char A, char B, char C){
        if (n == 0) {}
        else {
            hanoi(n - 1, A, C, B);
            moves += A + " " + C + "\n";
            ans++;
            hanoi(n - 1, B, A, C);
        }
    }
}
