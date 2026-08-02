class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = binary(nums,target,true);
        int right = binary(nums,target,false);
        return new int[] {left,right};

    }
    private int binary(int[] nums,int target,boolean bias){
        int left=0,right=nums.length-1,i=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(target<nums[mid])    right = mid - 1;
            else if(target>nums[mid])    left = mid + 1;
            else{
                i=mid;
                if(bias)    right = mid -1;
                else  left=mid+1;
            }
        }
        return i;
    }
}