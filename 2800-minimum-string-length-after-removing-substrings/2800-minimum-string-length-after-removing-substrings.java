class Solution {
    public int minLength(String s) {

        while(s.contains("AB") || s.contains("CD")){
            s = s.replaceAll("AB","").replaceAll("CD","");
        }

        return s.length();
    }
}