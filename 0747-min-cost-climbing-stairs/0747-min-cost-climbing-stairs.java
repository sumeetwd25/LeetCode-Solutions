class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a = cost[0];
        int b = cost[1];
        if(cost.length==2) return Math.min(a,b);
        for(int i=2; i<cost.length; i++){
            int c = cost[i] + Math.min(a,b);
            a = b;
            b = c;
        }
        return Math.min(a,b);
    }
}