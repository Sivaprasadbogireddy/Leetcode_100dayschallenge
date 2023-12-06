class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;  
        int leftoverDays = n % 7;  
        
        // Calculate the total money for full weeks
        int totalWeeksMoney = 28 * weeks + 7 * (weeks - 1) * weeks / 2;
        
        // Calculate the total money for leftover days
        int totalLeftoverMoney = leftoverDays * (leftoverDays + 1) / 2 + weeks * leftoverDays;
        
        return totalWeeksMoney + totalLeftoverMoney;
    }
}
