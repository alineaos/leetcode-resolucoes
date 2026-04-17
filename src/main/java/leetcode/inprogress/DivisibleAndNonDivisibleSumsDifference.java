package leetcode.inprogress;

public class DivisibleAndNonDivisibleSumsDifference {
    public static void main(String[] args) {
        long start = System.nanoTime();

        System.out.println(differenceOfSums(10,3));
        System.out.println(differenceOfSums(5,6));
        System.out.println(differenceOfSums(5, 1));

        long end = System.nanoTime();
        long time = end - start;
        System.out.println("Execution Time: " + (time / 1_000_000.0) + "ms");
    }

    public static int differenceOfSums(int n, int m){
        int num1 = 0, num2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m != 0){
                num1 += i;
            }
            if (i % m == 0){
                num2 += i;
            }
        }

        return num1 - num2;
    }
}
