// https://leetcode.com/problems/richest-customer-wealth/description/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; i++){
            int rowsum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                rowsum += accounts[i][j];
            }
            if(max < rowsum){
                max = rowsum;
            }
        }
        return max;
    }
}
