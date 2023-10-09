class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                list.add(i);
            }
        }

        if(!list.isEmpty()){
            arr[0] = list.get(0);
            arr[1] = list.get(list.size()-1);
        }
        return arr;
    }
}