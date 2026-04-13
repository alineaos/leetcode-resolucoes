package leetcode.resolved.easy;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));


        System.out.println("-----------------------------------------");
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        int index = 0;
        for (int i : nums) {

            if(integers.add(i)){
                nums[index++] = i;
            }
        }
        return integers.size();
    }
}
