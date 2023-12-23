class Solution {
    public String sortVowels(String s) {
        String res="";
        List<Character> list=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                list.add(ch);
            }
        }
        Collections.sort(list);
        int k=0;
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                res=res+list.get(k);
                k++;
            }
            else{
                res=res+ch;
            }
        }
        return res;
    }
}