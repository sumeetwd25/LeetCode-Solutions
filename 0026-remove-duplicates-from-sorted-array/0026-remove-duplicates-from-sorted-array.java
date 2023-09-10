import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> alist = new ArrayList<Integer>();

        for(int i : nums){
            alist.add(i);
        }

        TreeSet<Integer> tset = new TreeSet<Integer>();
        tset.addAll(alist);

        int index=0;
        for(Integer i : tset){
            nums[index] = i;
            index++;
        }
        
        return tset.size();
    }
}