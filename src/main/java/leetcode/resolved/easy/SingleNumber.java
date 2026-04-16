package leetcode.resolved.easy;

public class SingleNumber {
    public static void main(String[] args) {
        long start = System.nanoTime();

        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber(new int[]{1}));

        long end = System.nanoTime();
        long time = end - start;
        System.out.println("Execution Time: " + (time / 1_000_000.0) + "ms");
    }

    public static int singleNumber(int[] nums) {
        int response = 0;
        for (int i : nums) {
            response ^= i;
        }
        return response;
    }
}
