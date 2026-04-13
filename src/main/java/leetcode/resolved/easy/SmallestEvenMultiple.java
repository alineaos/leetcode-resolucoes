package leetcode.resolved.easy;

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(5));
        System.out.println(smallestEvenMultiple(6));
    }

    public static int smallestEvenMultiple(int n){
        if(n % 2 == 0){
            return n;
        } else {
            return n * 2;
        }
    }
}
