class Solution {
    public boolean isPalindrome(int x) {
        if(x==0) return true;
        else if(x<1) return false;
        else{
            int sum=0,m=x;
            while(x!=0){
                sum=(sum*10)+(x%10);
                x/=10;
            }
            if(m==sum)  return true;
        }
        return false;
    }
}