package leetcode_practice;

public class TwoSum {
    public static void main(String[] args) {
        int numbers[] = {-1,-2,-3,-4,-5};
        int target = -8;
        twoSum(numbers, target);

    }

    // first iter, 3 + 2
    // second iter 3 + 3
    // third iter  3 + 4
    // forth iter  3 + 5

    // first iter, 2 + 3
    // second iter 3 + 4
    // third iter  3 + 5

    // first iter, 3 + 4
    // second iter 3 + 5

    // first iter, 4 + 5
    public static int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        return array;
    }
}
