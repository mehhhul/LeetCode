class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int i = 0;
        while (i < n && nums[i] < 0) {
            i++;
        }
        
        int left = i - 1; 
        int right = i;     
        int k = 0;
        
        while (left >= 0 || right < n) {
            if (left < 0) {
                ans[k++] = nums[right] * nums[right];
                right++;
            } else if (right >= n) {
                ans[k++] = nums[left] * nums[left];
                left--;
            } else if (Math.abs(nums[left]) <= nums[right]) {
                ans[k++] = nums[left] * nums[left];
                left--;
            } else {
                ans[k++] = nums[right] * nums[right];
                right++;
            }
        }
        return ans;
    }
}