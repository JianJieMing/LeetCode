package easy;

import java.util.Arrays;

/**
 * 加一
 *
 * @author jianjieming
 * @date 2020/5/26 11:20
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] nums = {1, 2, 9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
