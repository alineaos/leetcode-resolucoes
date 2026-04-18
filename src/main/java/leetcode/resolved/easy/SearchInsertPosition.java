package leetcode.resolved.easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        long start = System.nanoTime();

        System.out.println(searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));

        long end = System.nanoTime();
        long time = end - start;
        System.out.println("Execution Time: " + (time / 1_000_000.0) + "ms");
    }

    public static int searchInsert(int[] nums, int target) {
        int position = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                position = i;
                break;
            }
        }

        if (position == -1){
            for (int i = 0; i < nums.length-1; i++) {
                if (target > nums[i] && target < nums[i + 1]) {
                    position = i+1;
                    break;
                }
            }
            if (position == -1){
                if (target > nums[nums.length-1]){
                    position = nums.length;
                }else{
                    position = 0;
                }
            }
        }
        return position;
    }
}
