import java.util.Arrays;

class Solution {
    public String frequencySort(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int n = ch.length;

        char[] uniqueChars = new char[n];
        int[] counts = new int[n];
        int idx = 0; // number of distinct characters found

        int i = 0;
        while (i < n) {
            int j = i;
            while (j < n && ch[j] == ch[i]) {
                j++;
            }
            uniqueChars[idx] = ch[i];
            counts[idx] = j - i;
            idx++;
            i = j;
        }

        // selection sort: order the idx entries by count, descending
        for (int a = 0; a < idx - 1; a++) {
            int maxPos = a;
            for (int b = a + 1; b < idx; b++) {
                if (counts[b] > counts[maxPos]) maxPos = b;
            }
            int tempC = counts[a]; counts[a] = counts[maxPos]; counts[maxPos] = tempC;
            char tempCh = uniqueChars[a]; uniqueChars[a] = uniqueChars[maxPos]; uniqueChars[maxPos] = tempCh;
        }

        char[] result = new char[n];
        int pos = 0;
        for (int a = 0; a < idx; a++) {
            for (int b = 0; b < counts[a]; b++) {
                result[pos++] = uniqueChars[a];
            }
        }
        return new String(result);
    }
}