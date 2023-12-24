class Solution {
    public int minOperations(String s) {
        int s1=0, s2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'!=i%2){
                s1++;
            }
            else{
                s2++;
            }
        }
        return Math.min(s1,s2);
    }
}