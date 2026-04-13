package leetcode.inprogress;

public class ReverseStringPrefix {
    public static void main(String[] args) {
        System.out.println(reversePrefix("ollo", 3));
        System.out.println(reversePrefix("xyz", 3));
        System.out.println(reversePrefix("abcd", 2));
        System.out.println(reversePrefix("hey", 1));
    }

    public static String reversePrefix(String s, int k) {
        char[] charArray = s.toCharArray();
        StringBuilder toReverse = new StringBuilder(k);
        StringBuilder sb = new StringBuilder(charArray.length);

        for (int i = 0; i < charArray.length; i++) {
            if(k == charArray.length){
                toReverse.append(charArray);
                break;
            } else if (i < k) {
                toReverse.append(charArray[i]);
            }else{
                sb.append(charArray[i]);
            }
        }

        return toReverse.reverse().append(sb).toString();
    }
}
