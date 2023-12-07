class Solution {
    public String reverseWords(String s) {
        String res="";
        String[] sep=s.split(" ");
        for(int i=0;i<sep.length;i++){
            sep[i]=reverse(sep[i]);
            res=res+" "+sep[i];
        }
        return res.trim();
    }

    public String reverse(String str){
        String nstr="";
        for (int i=0; i<str.length(); i++)
        { 
            nstr= str.charAt(i)+nstr; 
        }
        return nstr;
    }
}