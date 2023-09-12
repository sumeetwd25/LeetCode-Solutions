class Solution {
    public int searchInsert(int[] nums, int target) {

        if(target<nums[0]){
            return 0;
        }

        for (int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }

        for (int i=0; i<nums.length; i++){
            if(nums[i]>target && nums[i-1]<target){
                return i;
            }
        }

        if(target>nums[nums.length-1]){
            return nums.length;
        }
        return 0;
    }
}