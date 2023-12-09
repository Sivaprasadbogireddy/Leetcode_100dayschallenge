class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> n=new ArrayList<>();
        for(int i:nums){
            n.add(i);
        }
        while(n.contains(original)){
            original=original*2;
        }
        return original;
    }
}