class Solution {
    // Function to remove non-alphabet characters
    public String removeNonAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            // Check if character is alphabet
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                result.append(c);
            }
        }
        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "He!!llo W@orld123";
        Solution sol = new Solution();
        System.out.println("Original String: " + s);
        System.out.println("Filtered String: " + sol.removeNonAlphabets(s));
    }
}