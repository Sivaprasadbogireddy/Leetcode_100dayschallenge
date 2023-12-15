class Solution {
    public int countGoodSubstrings(String s) {
        int res=0;
        for(int i=0;i<s.length()-2;i++){
            String str=s.substring(i,i+3);
            System.out.println(str);
            if(Unique(str)){
                res++;
            }
        }
        return res;
    }
    public boolean Unique(String str){
        Set<Character> tmp=new HashSet<>();
        for(char ch: str.toCharArray()){
            tmp.add(ch);
        }
        return tmp.size()==str.length();
    }
}