class Solution {
    public int integerBreak(int n) {
        if(n==2 || n==3) return n-1;
        if(n==4) return 4;

        int sum = 1;
        int temp = n;
        while(temp>4){
            temp = temp-3;
            sum = sum*3;
        }
        return sum*temp;
    }
}