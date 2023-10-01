class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");

        for(int i=0; i<arr.length; i++){

            //method 2
            // String x = "";
            // for(int j=arr[i].length()-1; j>=0; j--){
            //     x+=arr[i].charAt(j);
            // }
            // arr[i] = x;

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

            //method 2
            //reverse = String.join(" ", arr);
            
        }
        return reverse;
    }
}