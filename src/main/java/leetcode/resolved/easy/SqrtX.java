package leetcode.resolved.easy;

public class SqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(2147395599)); //expected 46339
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int first = 0;
        int last = x;

        while (first <= last) {
            int middle = first + (last - first) / 2;
            if (middle == x/middle) {
                return middle;
            } else if (middle  > x/middle) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }

        return last;
    }
}
