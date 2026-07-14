class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> miss = new HashSet<>();
        for(int n=0;n<nums.length;n++){
            if(miss.contains(nums[n])){
                miss.remove(nums[n]);
            }
            else{
                miss.add(nums[n]);
            }
        }
        int num = miss.iterator().next();
        return num;
    }
}