class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        HashSet<Integer> hset = new HashSet<>();
        int n = nums.length/3;

        TreeSet tset = new TreeSet<>();
        for(int i:nums){
            tset.add(i);
        }

        List<Integer> list2 = new ArrayList<>(tset);       
        
        for(int i=0; i<list2.size(); i++){

            int count = 0;
            for(int j=0; j<nums.length; j++){

                if(list2.get(i)==nums[j]){
                    ++count;

                    if(count>n){
                        hset.add(list2.get(i));
                    }
                }
            }
        }
        return new ArrayList<>(hset);

    }
}