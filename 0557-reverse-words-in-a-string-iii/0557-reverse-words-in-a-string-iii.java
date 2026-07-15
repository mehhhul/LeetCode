class Solution {

    public String reverseWords(String s) {
        char[] ss = s.toCharArray();
        
        int j =0,i=0;
        while(j<ss.length) {
            if(ss[j]!=' ') j++;
            else {
                int k=i,l=j-1;
                while(k<l){
                    char a = ss[k];
                    ss[k] = ss[l];
                    ss[l] = a;
                    k++;l--;
                }
            j++;
            i=j;
            }
        }
         int k=i,l=j-1;
                while(k<l){
                    char a = ss[k];
                    ss[k] = ss[l];
                    ss[l] = a;
                    k++;l--;
                }
            j++;
            i=j;
        String ans = new String(ss);
        return ans;
    }
}