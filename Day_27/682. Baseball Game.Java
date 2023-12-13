class Solution {
    public int calPoints(String[] operations) {
        int res=0;
        List<Integer> list=new ArrayList<>();
        for(String str:operations){
            int l=list.size();
            if(str.equals("+")){
                list.add(list.get(l-1)+list.get(l-2));
            }
            else if(str.equals("C")){
                list.remove(l-1);
            }
            else if(str.equals("D")){
                list.add(2*list.get(l-1));
            }
            else {
                list.add(Integer.parseInt(str));
            }
        }
        for(int i:list){
            res=res+i;
        }
        return res;

    }
}