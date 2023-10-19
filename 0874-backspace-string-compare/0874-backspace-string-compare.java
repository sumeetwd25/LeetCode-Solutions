class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(t);
        
        int i=0;
        while(i<sb1.length()){
            if(sb1.charAt(i)=='#'){
                if(i>0){
                    sb1.delete(i-1,i+1);
                    i--;
                }
                else{
                    sb1.deleteCharAt(i);
                }
            }
            else{
                i++;
            }
        }

        int j=0;
        while(j<sb2.length()){
            if(sb2.charAt(j)=='#'){
                if(j>0){
                    sb2.delete(j-1,j+1);
                    j--;
                }
                else{
                    sb2.deleteCharAt(j);
                }
            }
            else{
                j++;
            }
        }

        return sb1.toString().equals(sb2.toString());
    }
}