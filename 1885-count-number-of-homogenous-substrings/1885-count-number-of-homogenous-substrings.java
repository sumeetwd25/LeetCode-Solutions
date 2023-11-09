class Solution {
    public int countHomogenous(String s) {
        long homogeneous = 0;
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            
            if(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                homogeneous += count;
            }
            else {
                count = 1;
                homogeneous += count;
            }
        }
        return (int) (homogeneous % (1000000007));
    }
}