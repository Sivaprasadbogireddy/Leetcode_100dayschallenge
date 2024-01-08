class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        int res=0;
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }
        res+=set1.size()<nums1.length/2?set1.size():nums1.length/2;
        res+=set2.size()<nums2.length/2?set2.size():nums2.length/2;
        Set<Integer> set3=new HashSet<>();
        for(int i:set1){
            set3.add(i);
        }
        for(int i:set2){
            set3.add(i);
        }
        return Math.min(res, set3.size());
    }
}