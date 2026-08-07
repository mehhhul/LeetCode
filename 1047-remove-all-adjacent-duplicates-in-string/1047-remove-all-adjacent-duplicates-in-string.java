class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty() || s.charAt(i)!=stack.peek() ){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==stack.peek()){
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();

        for (char c : stack) {
            sb.append(c);
        }

        String result = sb.toString();

        return result;
    }
}