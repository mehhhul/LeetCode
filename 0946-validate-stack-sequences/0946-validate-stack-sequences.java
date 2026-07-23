class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int i=0,j=0;
        while(j<popped.length){
            if(!stack.isEmpty() && popped[j]==stack.peek()){
                j++;stack.pop();
            }
            else if(i<pushed.length && popped[j]==pushed[i]){
                j++;i++;
            }
            else if(i<pushed.length){
                stack.push(pushed[i]);i++;
                
            }
            else j++;
        }
        if(!stack.isEmpty())  return false;
        return true;
    }
}