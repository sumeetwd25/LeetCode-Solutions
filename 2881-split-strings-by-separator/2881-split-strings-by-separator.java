class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> list = new ArrayList<>();

        // String sep = Character.toString(separator);
        // if (".|[$(){}^?*+\\".indexOf(separator) != -1) {
        //     sep = "\\" + sep;
        // }

        for(String word : words){
            String arr[]=word.split("["+separator+"]");

            for(String e : arr){
                if(!e.isEmpty())
                list.add(e);
            }
        }

        return list;
    }
}