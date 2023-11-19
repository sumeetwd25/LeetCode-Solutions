class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int sum = 0, temp = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                temp++;
            }
            sum += temp;
        }
        return sum;
    }
}