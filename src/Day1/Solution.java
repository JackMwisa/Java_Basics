package Day1;

class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        // Edge case: if needle is longer than haystack, return -1
        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        // If no match is found, return -1
        return -1;
    }
}



