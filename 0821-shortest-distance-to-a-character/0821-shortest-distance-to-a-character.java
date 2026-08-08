// class Solution {
//     public int[] shortestToChar(String s, char c) {
//         int a=0,b=s.indexOf(c),d=0;
//         int[] arr = new int[s.length()];
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i) == c){
//                 for(int j=a;j<=i;j++){
//                     arr[j]=Math.min(Math.abs(i-j),Math.abs(b-j));
//                 }
//                 a=i+1;
//                 b=i;
//             }

//         }
//         return arr;
//     }
// }

// 

class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] arr = new int[n];
        int prev = -n; 

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) prev = i;
            arr[i] = i - prev;
        }

        prev = 2 * n;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) prev = i;
            arr[i] = Math.min(arr[i], prev - i);
        }

        return arr;
    }
}