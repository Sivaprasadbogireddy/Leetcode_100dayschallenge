class Solution {
    public String largestGoodInteger(String num) {
        String[] n={"999","888","777","666","555","444","333","222","111","000"};
        String res="";
        for(String str:n){
            if(num.contains(str)){
                res=str;
                break;
            }
        }
        return res;
    }
}