class Solution {
    public void reverseString(char[] s) {
        int a=s.length;
        for(int i = 0,j=a-1;i<(a/2);i++,j--){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
}