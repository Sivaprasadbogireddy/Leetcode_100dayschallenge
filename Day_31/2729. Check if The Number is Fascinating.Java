class Solution {
    public boolean isFascinating(int n) {
        int n2=2*n, n3=3*n;
        String str=""+n+n2+n3;
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1] || ch[i]=='0'){
                return false;
            }
        }
        return true;
    }
}