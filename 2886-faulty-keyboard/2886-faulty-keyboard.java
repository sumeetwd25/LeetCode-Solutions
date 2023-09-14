class Solution {
    public String finalString(String s) {

        String s1="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='i'){

                StringBuilder s2 = new StringBuilder(s1).reverse();
                s1=s2.toString();
            }
            else{
                s1+=s.charAt(i);
            }
        }

        return s1;
    }
}