class Solution {
    public int countSeniors(String[] details) {
        int res=0;
        for(String str:details){
            int age=Integer.parseInt(str.substring(11,13));
            //System.out.println(age);
            if(age>60){
                res++;
            }
        }
        return res;
    }
}