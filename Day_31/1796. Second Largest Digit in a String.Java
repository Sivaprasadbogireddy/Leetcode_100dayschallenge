class Solution {
    public int secondHighest(String s) {
        boolean b=false;
        for(int i=9;i>=0;i--){
            if(s.contains(i+"")){
                if(b){
                    return i;
                }
                else{
                    b=true;
                }
            }
        }
        return -1;
    }
}