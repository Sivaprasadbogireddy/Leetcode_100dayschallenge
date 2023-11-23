class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int[] temp=new int[r[i]-l[i]+1];
            int x=0;
            for(int k=l[i];k<=r[i];k++){
                temp[x++]=nums[k];
            }
            if(rearrangeArray(temp)){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }

    public static boolean rearrangeArray(int[] arr) {
        Arrays.sort(arr);  // Sort the array in ascending order
        int n = arr.length;
        if (n < 2) {
            return false;  
        }
        int commonDiff = arr[1] - arr[0];
        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] != commonDiff) {
                return false;
            }
        }

        return true;
    }
}