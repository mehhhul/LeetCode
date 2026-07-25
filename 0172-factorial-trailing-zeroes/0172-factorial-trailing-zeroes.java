class Solution {
    public int trailingZeroes(int n) {
        int reminder=0,zeroes=0,denominator=1;
        do{
            denominator*=5;
            reminder=n/denominator;
            zeroes+=reminder;
        }while(reminder!=0);
        return zeroes;
    }
}