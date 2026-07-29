class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int i = purchaseAmount % 10;
        int j=0;
        if(i==0)        j = purchaseAmount;
        else if(i<5)    j = purchaseAmount - i;
        else if(i>=5)   j = (10-i) + purchaseAmount;
        return 100-j;
    }
}