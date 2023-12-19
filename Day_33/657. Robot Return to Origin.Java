class Solution {
    public boolean judgeCircle(String moves) {
        int ud=0,lr=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U'){
                ud++;
            }
            else if(ch=='D'){
                ud--;
            }
            else if(ch=='R'){
                lr++;
            }
            else{
                lr--;
            }
        }
        return ud==0 && lr==0;
    }
}