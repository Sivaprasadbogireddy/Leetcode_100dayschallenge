class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] res=new int[2];
        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();

        // Convert nums1 to List<Integer>
        for (int num : nums1) {
            n1.add(num);
        }

        // Convert nums2 to List<Integer>
        for (int num : nums2) {
            n2.add(num);
        }
        
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            if(n2.contains(nums1[i])){
                temp1.add(i);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(n1.contains(nums2[i])){
                temp2.add(i);
            }
        }
        res[0]=temp1.size();
        res[1]=temp2.size();
        return res;
    }
}