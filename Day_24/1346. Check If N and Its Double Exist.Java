class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(Contains(i,arr)){
                return true;
            }
        }
        return false;
    }
    public boolean Contains(int i, int[] arr){
        for(int j=0;j<arr.length;j++){
            if(2*arr[i]==arr[j] && i!=j){
                return true;
            }
        }
        return false;
    }
}