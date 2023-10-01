class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");

        for(int i=0; i<arr.length; i++){
            StringBuilder builder = new StringBuilder(arr[i]).reverse();
            arr[i] = builder.toString();
        }

        String reverse = "";
        for(int i=0; i<arr.length; i++){
            
            if(i==arr.length-1){
                reverse+=arr[i];
            }
            else{
                reverse+=arr[i]+" ";
            }
            
        }
        return reverse;
    }
}