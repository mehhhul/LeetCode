class Solution {
    public int countPrimes(int n) {
        if (n < 3) return 0;
        int count = 0;
        boolean[] arr = new boolean[n];

        for (int i = 2; i < n; i++) {
            arr[i] = true;
        }

        for(int i = 2;i*i < n;i++){
            if(arr[i]==true){
                for(int j = i*i;j<n;j+=i) arr[j] = false;
            }
        }
        for(boolean i: arr){
            if(i) count++;
        }
        return count;
    }
}