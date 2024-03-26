package veer.com;

public class SubstringCount {

    public static int countSubstrings(String str) {
        int count = 0;
        int length = str.length();

        // Nested loops to generate all possible substrings
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                // Extract substring from start to end
                String substring = str.substring(i, j);
                System.out.println(substring); // Optional: Print substrings
                count++;
            }
        }

        return count; 
    }

    public static void main(String[] args) {
        String text = "abcd";
        int substrCount = countSubstrings(text);
        System.out.println("Total substrings: " + substrCount);
    }
}