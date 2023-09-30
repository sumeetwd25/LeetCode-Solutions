class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;

        String arr[] = new String[s.length()];
        for(int i=0; i<arr.length; i++){
            arr[i] = "0";
        }

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }

        if(count==1){
            arr[arr.length-1]="1";
            String s1 = "";
            for(String i:arr){
                s1+=i;
            }
            return s1;
        }
        else{
            arr[arr.length-1]="1";
            for(int i=0; i<count-1; i++){
                arr[i] = "1";
            }

            String s1 = "";
            for(String i:arr){
                s1+=i;
            }

            return s1;
        }
    }
}