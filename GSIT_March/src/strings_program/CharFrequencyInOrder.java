package strings_program;

public class CharFrequencyInOrder {
    public static void main(String[] args) {
        String s = "toommo";
        String result = "";
        boolean[] b = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (b[i]) continue;

            int count = 1;

            // Count frequency of current character
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    count++;
                    b[j] = true;
                }
            }

            result += s.charAt(i) + String.valueOf(count);
        }

        System.out.println("Output: " + result);
    }
}

