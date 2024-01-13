class Solution {
    public boolean halvesAreAlike(String s) {
        String str="aeiouAEIOU";
        int x=0, y=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()/2 && str.contains(s.charAt(i)+"")){
                x++;
            }
            if(i>=s.length()/2 && str.contains(s.charAt(i)+"")){
                y++;
            }
        }
        return x==y;
    }
}