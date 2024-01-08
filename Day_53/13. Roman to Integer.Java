class Solution {
    public int romanToInt(String s) {
        int res=0;
       Map<Character, Integer> map=new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000); 
       int n=0;
       for(int i=s.length()-1;i>=0;i--){
           n=map.get(s.charAt(i));
           if(4*n<res){
               res=res-n;
           }else{
               res=res+n;
           }
       }
       return res;
    }
}