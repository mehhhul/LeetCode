class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
         if (n % 2 != 0)  return false;
        char[] c = s.toCharArray();
        for(int i=0;i<n;i++){
            if(c[i]=='(' || c[i]=='{' || c[i]=='['){
                stack.push(c[i]);
            }
            else{
                if(stack.isEmpty()) return false;
                if(c[i]==')'){
                    char b = stack.pop();
                    if(b!='(')  return false;
                }
                if(c[i]=='}'){
                    char b = stack.pop();
                    if(b!='{')  return false;
                }
                if(c[i]==']'){
                    char b = stack.pop();
                    if(b!='[')  return false;
                }
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}