class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int index = 0;
        for(int i = 1; i <= n; i++){
            stack.push(i);
            list.add("Push");

            if(index == target.length-1 && stack.peek() == target[index]) return list;

            if(index < target.length && target[index] == stack.peek()){
                index++;
            }
            else{
                stack.pop();
                list.add("Pop");
            }
           
        }
        return list;
    }
}