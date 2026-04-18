package leetcode.resolved.easy;

public class MirrorDistanceInteger {
    public static void main(String[] args) {
        long start = System.nanoTime();

        System.out.println(mirrorDistance(25));
        System.out.println(mirrorDistance(10));
        System.out.println(mirrorDistance(7));

        long end = System.nanoTime();
        long time = end - start;
        System.out.println("Execution Time: " + (time / 1_000_000.0) + "ms");
    }

    public static int mirrorDistance(int n) {
        int numberToReverse = n;
        int reversedN = 0;

        while (numberToReverse != 0) {
            int lastDigit = numberToReverse % 10;
            reversedN = reversedN * 10 + lastDigit;
            numberToReverse /= 10;
        }

        return Math.abs(n - reversedN);
    }
}
