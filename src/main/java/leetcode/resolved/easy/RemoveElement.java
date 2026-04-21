package leetcode.resolved.easy;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }





//    public static int removeElement(int[] nums, int val) {
//        int[] array = Arrays.stream(nums).filter(n -> n != val).toArray();
//        System.out.println(Arrays.toString(array));
//        return array.length;
//    }
}
