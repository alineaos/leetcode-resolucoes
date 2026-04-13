package leetcode.resolved.easy;

import java.util.Arrays;

public class RestoreFinishingOrder {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(recoverOrder(new int[]{3, 1, 2, 5, 4}, new int[]{1, 3, 4})));
        System.out.println(Arrays.toString(recoverOrder(new int[]{1, 4, 5, 3, 2}, new int[]{2, 5})));
    }

    public static int[] recoverOrder(int[] order, int[] friends) {
        int[] array = new int[friends.length];
        int l = 0;

        for (int i : order) {
            for (int j : friends) {
                if (i == j){
                    array[l] = j;
                    l++;
                }
            }
        }

        return array;
    }
}
