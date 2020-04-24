package simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jianjieming
 * @date 2020/4/24 14:45
 */
public class TwoNumSum {
    public static void main(String[] args) {
        int[] nums = {2, 11, 7, 5};
        int target = 9;
        int[] sum = twoSum(nums, target);
        System.out.println(Arrays.toString(sum));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(5);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
