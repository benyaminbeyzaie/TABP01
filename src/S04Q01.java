class S04Q01 {
    public static void main(String[] args) {
        // [-2, -1, 0, 4, 7]
        // .
        // [49, 16, 4, 1, 0]
        // O(n) < O(nlogn)
        int[] temp = new int[6];
        temp[0] = -2;
        temp[1] = -1;
        temp[2] = 0;
        temp[3] = 3;
        temp[4] = 4;
        temp[5] = 5;

        temp = sortSquare(temp);
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ", ");
        }
    }

    public static int[] sortSquare(int[] numbers) {
        int firstIndex = 0;
        int lastIndex = numbers.length - 1;
        int counter = 0;
        int[] ans = new int[numbers.length];
        while (firstIndex != lastIndex) {
            int x = numbers[firstIndex] * numbers[firstIndex];
            int y = numbers[lastIndex] * numbers[lastIndex];
            if (x > y) {
                ans[counter] = x;
                firstIndex++;
            } else { // x <= y
                ans[counter] = y;
                lastIndex--;
            }
            counter++;
        }
        ans[counter] = numbers[firstIndex] * numbers[firstIndex];
        return ans;
    }
}