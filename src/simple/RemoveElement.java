package simple;

import java.util.Arrays;

/**
 * 移除元素
 *
 * @author jianjieming
 * @date 2020/5/18 13:33
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(removeElement(nums, 2));
        System.out.println(Arrays.toString(nums));
    }

    private static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
