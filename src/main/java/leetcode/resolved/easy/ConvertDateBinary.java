package leetcode.resolved.easy;

public class ConvertDateBinary {
    public static void main(String[] args) {
        System.out.println(convertDateToBinary("2080-02-29"));
        System.out.println(convertDateToBinary("1900-01-01"));
    }

    public static String convertDateToBinary(String date) {
        String[] strings = date.split("-");
        Integer[] integers = new Integer[3];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            sb.append("-");
            integers[i] = Integer.parseInt(strings[i]);
            sb.append(Integer.toBinaryString(integers[i]));
        }

        return sb.replace(0,1, "").toString();
    }
}
