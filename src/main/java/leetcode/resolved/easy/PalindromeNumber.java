package leetcode.resolved.easy;

class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    static boolean isPalindrome(int x) {
        String string = Integer.toString(x);
        StringBuilder reverseString = new StringBuilder(string).reverse();
        return string.contentEquals(reverseString);
    }
}