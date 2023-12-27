class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] tmp=s.toCharArray();
        if(s.length()==1){
            return s;
        }
        String res="";
        for(char ch:s.toCharArray()){
            if(ch=='0'){
                res=res+""+ch;
            }else{
                res=ch+""+res;
            }
        }
        return res.substring(1)+res.charAt(0);
    }
}