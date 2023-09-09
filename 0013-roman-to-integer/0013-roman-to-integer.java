class Solution {
    public int romanToInt(String s) {
        int num=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='I'){
                num++;
            }


            else if(s.charAt(i)=='V'){
                
                
                num=num+5;
                if(i-1>=0 && s.charAt(i-1)=='I'){
                    num=num-2;
                }
            }


            else if(s.charAt(i)=='X'){
                
               
                num=num+10;
                if(i-1>=0 && s.charAt(i-1)=='I'){
                    num=num-2;
                }
            }


            else if(s.charAt(i)=='L'){
                
                
                num=num+50;
                if(i-1>=0 && s.charAt(i-1)=='X'){
                    num=num-20;
                }
            }


            else if(s.charAt(i)=='C'){
                
                
                num=num+100;
                if(i-1>=0 && s.charAt(i-1)=='X'){
                    num=num-20;
                }
            }


            else if(s.charAt(i)=='D'){
                
                
                num=num+500;
                if(i-1>=0 && s.charAt(i-1)=='C'){
                    num=num-200;
                }
            }

            
            else if(s.charAt(i)=='M'){
                
                
                num=num+1000;
                if(i-1>=0 && s.charAt(i-1)=='C'){
                    num=num-200;
                }
            }
        }
        return num;
    }
}