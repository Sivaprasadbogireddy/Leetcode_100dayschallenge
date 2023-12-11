class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int res=0;
        int n=batteryPercentages.length;
        for(int i=0;i<n;i++){
            if(batteryPercentages[i]>0){
                batteryPercentages= changeBattery(i+1, batteryPercentages);
                res++;
            }
        }
        return res;
    }
    
    public int[] changeBattery(int k, int[] battery){
        for(int x=k;x<battery.length;x++){
            battery[x] = Math.max(0, battery[x] - 1);
        }
        return battery;
    }
}