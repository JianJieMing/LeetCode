package simple;

/**
 * 匹配字符串
 *
 * @author jianjieming
 * @date 2020/5/19 17:07
 */
public class MatchStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    private static int strStr(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();
        for (int start = 0; start < n - L + 1; ++start) {
            if (haystack.substring(start, start + L).equals(needle)) {
                return start;
            }
        }
        return -1;
    }
}
