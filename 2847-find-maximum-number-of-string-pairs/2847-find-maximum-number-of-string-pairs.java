class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        List<String> list =  new ArrayList<>();
        int pair=0;

        for(String word : words){
            list.add(word);
        }

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                StringBuilder builder = new StringBuilder(list.get(i)).reverse();
                String reverse = builder.toString();
                if(list.get(j).equals(reverse)){
                    pair++;
                }
            }
        }

        return pair;
    }
}