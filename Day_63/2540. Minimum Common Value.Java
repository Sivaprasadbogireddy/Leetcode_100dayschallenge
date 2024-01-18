class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            if(set1.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
