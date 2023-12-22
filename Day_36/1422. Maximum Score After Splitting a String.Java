class Solution {
    public int maxScore(String s) {
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            String str1=s.substring(0,i+1);
            String str2=s.substring(i+1,s.length());
           // System.out.println("Str1: "+str1+" Str2: "+str2);
            int lz=0, ro=0;
            for(char ch:str1.toCharArray()){
                if(ch=='0'){
                    lz++;
                }
            }
            for(char ch:str2.toCharArray()){
                if(ch=='1'){
                    ro++;
                }
            }
            if(res<(lz+ro)){
                res=lz+ro;
            }
        }
        return res;
    }
}