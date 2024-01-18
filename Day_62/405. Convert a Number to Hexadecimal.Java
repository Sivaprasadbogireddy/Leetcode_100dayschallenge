class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        long val=num;
        if(num<0){
             val = (long) (Math.pow(2,32) + num);
        }
        char[] conv={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String res="";
        while(val>0){
            //System.out.println((int)val%16);
            res=conv[(int) (val - (((int) (val / 16)) * 16))]+res;
            val=val/16;
        }
        return res;
    }


}