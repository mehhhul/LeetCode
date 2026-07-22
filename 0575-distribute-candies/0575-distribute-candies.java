class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> type = new HashSet<>();
        for(int i:candyType)     type.add(i);
        return Math.min(type.size(),candyType.length/2);
    }
}