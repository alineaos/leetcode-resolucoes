package leetcode.resolved.easy;

public class ScoreOfAString {
    public static void main(String[] args) {
        System.out.println(scoreOfString("zaz"));
        System.out.println(scoreOfString("hello"));
    }



    public static int scoreOfString(String s) {
        char[] charArray = s.toCharArray();
        int sum = 0;
        for (int i = 1; i < charArray.length; i++) {
                sum+= Math.abs(charArray[i-1] - charArray[i]);

        }

        return sum;
    }
}
