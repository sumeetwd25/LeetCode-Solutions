class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String arr[] = new String[words.size()];

        int index=0;
        for(String word : words){
            arr[index]=word;
            index++;
        }

        String acronym = "";
        for(int i=0; i<arr.length; i++){
            acronym = acronym+(arr[i].substring(0,1)); 
        }

        if(acronym.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}