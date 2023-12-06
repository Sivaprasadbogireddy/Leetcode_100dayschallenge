class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
      String[] str=text.split(" ");
      int res=0;
      for(String s:str){
          for(char ch:s.toCharArray()){
              if(brokenLetters.contains(""+ch)){
                  res--;
                  break;
              }
          }
          res++;
      } 
      return res; 
    }
}