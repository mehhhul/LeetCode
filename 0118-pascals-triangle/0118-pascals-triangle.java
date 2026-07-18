class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            int j=0;
            while(j<=i){
                if(j==0 || j==i) row.add(1);
                else{
                    row.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
                j++;
            }
            ans.add(row);
        }
        return ans;
    }
}