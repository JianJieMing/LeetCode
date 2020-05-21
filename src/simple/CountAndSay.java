package simple;

/**
 * 外观数列
 *
 * @author jianjieming
 * @date 2020/5/21 15:06
 */
public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    private static String countAndSay(int n) {
        String str = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder builder = new StringBuilder();
            char pre = str.charAt(0);
            int count = 1;
            for (int j = 1; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == pre) {
                    count++;
                } else {
                    builder.append(count).append(pre);
                    pre = c;
                    count = 1;
                }
            }
            builder.append(count).append(pre);
            str = builder.toString();
        }
        return str;
    }
}
