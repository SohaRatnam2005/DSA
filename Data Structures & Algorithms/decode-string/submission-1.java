class Solution {
    public String decodeString(String s) {

        Deque<Integer> nums = new ArrayDeque<>();
        Deque<String> str = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                nums.push(num);
                str.push(sb.toString());

                num = 0;
                sb.setLength(0);
            }

            else if (ch == ']') {
                int k = nums.pop();

                String previous = str.pop();

                sb = new StringBuilder(previous + sb.toString().repeat(k));
            }

            else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}