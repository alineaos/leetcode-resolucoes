package leetcode.resolved.easy;

public class FindClosestPerson {
    public static void main(String[] args) {
        System.out.println(findClosest(2, 7, 4));
        System.out.println(findClosest(2, 5, 6));
        System.out.println(findClosest(1, 5, 3));
    }

    public static int findClosest(int x, int y, int z) {
        int stepsX = Math.abs(z - x);
        int stepsY = Math.abs(z - y);

        if (stepsX == stepsY) {
            return 0;
        } else if (stepsX < stepsY) {
            return 1;
        } else {
            return 2;
        }
    }
}
