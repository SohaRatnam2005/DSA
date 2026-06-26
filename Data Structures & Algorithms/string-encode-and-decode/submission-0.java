class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            for (char c : s.toCharArray()) {
                if (c == '#' || c == '\\') {
                    sb.append('\\'); // escape character
                }
                sb.append(c);
            }
            sb.append('#'); // separator
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

       List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '\\') {
                // next character is part of the string
                i++;
                sb.append(str.charAt(i));
            }
            else if (c == '#') {
                result.add(sb.toString());
                sb.setLength(0);
            }
            else {
                sb.append(c);
            }
        }

        return result;
    }
}
