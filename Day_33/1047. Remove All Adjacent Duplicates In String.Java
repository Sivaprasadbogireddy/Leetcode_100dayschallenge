class Solution {
    public String removeDuplicates(String s) {
        String res="";
        List<Character> str=new ArrayList<>();
        str.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(str.size()>0){
                if(s.charAt(i)==str.get(str.size()-1)){
                    str.remove(str.size()-1);
                }
                else{
                    str.add(s.charAt(i));
                }
            }
            else{
                str.add(s.charAt(i));
            }
        }
        for (char c : str) {
            res+=c;
        }
        return res;
    }
}