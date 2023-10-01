class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String arr[] = s.split(" ");
        String s1 = "";
        
        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[i].length(); j++){
                
                if(Character.isLetterOrDigit(arr[i].charAt(j))){
                    s1+=arr[i].charAt(j);
                }
            }
        }

        StringBuilder builder = new StringBuilder(s1).reverse();
        String s2 = builder.toString();

        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
    }
}