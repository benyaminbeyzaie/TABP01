import java.util.Scanner;

public class S02Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int[] index = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            index[i] = i + 1;
        }
        // start to sort!
        boolean swap = true;
        for (int i = 0; i < size - 1; i++) {
            if (!swap) break;
            swap = false;
            for (int j = 0; j < size - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]){
                    swap = true;
                    // swap
                    int a = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = a;

                    // swap index
                    a = index[j];
                    index[j] = index[j + 1];
                    index[j + 1] = a;
                }
            }

        }

        for (int i = 0; i < size; i++) {
            System.out.print(index[i] + " ");
        }
    }
}

/*
4 12 32 16 88
 */
