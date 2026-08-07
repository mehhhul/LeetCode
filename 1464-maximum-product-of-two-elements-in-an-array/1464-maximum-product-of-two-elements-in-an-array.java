class Solution {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // return ((nums[n-1]-1)*(nums[n-2]-1));
        int max=Integer.MIN_VALUE,secmax=max;
        for(int n:nums){
            if(n>max) {
                secmax=max;
                max=n;
        }
        else if(n>secmax && n<=max){
            secmax=n;
        }
    }
        return ((max-1)*(secmax-1));
}
}