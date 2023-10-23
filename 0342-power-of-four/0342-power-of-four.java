class Solution {
    public boolean isPowerOfFour(int n) {
        
        
        double result=0;
        int x=0;
        while(result < n){
            result = Math.pow(4, x);
            if(result==n) return true;
            ++x;
        }
        return false; 

        //Method 2: w/o using loop/recursion.
        
        // if(n<=0) return false;
        // double logResult = Math.log(n)/Math.log(4);
        // return Math.floor(logResult)==logResult;   
    }
}