class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        // if(digits[n-1]!=9){
        //     digits[n-1]+=1;
        //     return digits;
        // }
        // boolean flag = true;boolean f1 = true;
        // for(int i=0;i<n-1;i++){
        //     if(digits[i]!=9) flag = false;
        // }
        // if(flag){
        //     int[] arr = new int[n+1];
        //     arr[0]=1;
        //     return arr;
        // }
        // else{
        //     int a = n-1;
        //     while(f1){
        //         digits[a]=0;
        //         if(digits[a-1]!=9){ f1=false;
        //         digits[a-1]+=1;}
        //         else a--;
        //     }
        // }
        // return digits;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        int[] arr = new int[n+1];
        arr[0]=1;
        return arr;
    }
}