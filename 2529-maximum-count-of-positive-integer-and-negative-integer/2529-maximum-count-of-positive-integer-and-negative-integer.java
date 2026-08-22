class Solution {
    public int maximumCount(int[] arr) {
        int n = arr.length;
        int firstpos = n, lastneg = -1;

        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > 0) {
                firstpos = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        left = 0; right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < 0) {
                lastneg = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        int pos = n - firstpos;
        int neg = lastneg + 1;
        return Math.max(pos, neg);
    }
}