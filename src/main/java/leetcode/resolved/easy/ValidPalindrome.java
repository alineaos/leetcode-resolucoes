package leetcode.resolved.easy;

import java.util.regex.Pattern;

public class ValidPalindrome {
    public static void main(String[] args) {
        long start = System.nanoTime();

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("ab_a"));

        long end = System.nanoTime();
        long time = end - start;
        System.out.println("Execution Time: " + (time / 1_000_000.0) + "ms");
    }

    public static boolean isPalindrome (String s){
        final Pattern regex = Pattern.compile("[\\W_]");
        String replaceString = regex.matcher(s).replaceAll("");
        StringBuilder sb = new StringBuilder(replaceString).reverse();
        return sb.toString().equalsIgnoreCase(replaceString);
    }
}
