class Solution {
    public boolean isPalindrome(int x) {
        String s1 = String.valueOf(x);

        StringBuilder s2 = new StringBuilder(s1).reverse();

        if(s1.equals(s2.toString())){
            return true;
        }
        else{
            return false;
        }
    }
}