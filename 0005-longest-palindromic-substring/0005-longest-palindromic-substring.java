class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;

        String palindrome="";
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String s1 = s.substring(i,j);
                if(isPalindrome(s1) && s1.length()>palindrome.length()){
                    palindrome = s1;
                }       
            }
        }
        return palindrome;
    }

    public boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}