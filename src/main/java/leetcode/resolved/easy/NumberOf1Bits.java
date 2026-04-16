package leetcode.resolved.easy;

public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(128));
        System.out.println(hammingWeight(2147483645));
    }

    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
