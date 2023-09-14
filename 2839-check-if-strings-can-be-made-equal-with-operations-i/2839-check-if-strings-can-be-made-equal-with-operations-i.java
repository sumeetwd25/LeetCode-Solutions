class Solution {
    public boolean canBeEqual(String s1, String s2) {

      if(s1.equals(s2)){
        return true;
      }

      char arr1[] = s1.toCharArray();
      char arr2[] = s2.toCharArray();

      if(arr1[0]!=arr2[0] && arr1[2]!=arr2[2]){
        char temp = arr1[0];
        arr1[0] = arr1[2];
        arr1[2] = temp;
      }

      
      if(arr1[1]!=arr2[1] && arr1[3]!=arr2[3]){
        char temp = arr1[1];
        arr1[1] = arr1[3];
        arr1[3] = temp;
      }
      

      String swappedStr = new String(arr1);
      if(swappedStr.equals(s2)){
        return true;
      }
      else{
        return false;
      }
    }
}