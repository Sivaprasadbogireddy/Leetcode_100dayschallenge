class Solution {
    public boolean isPathCrossing(String path) {
     List<String> visited=new ArrayList<>();
     int x=0, y=0;
     visited.add(x+","+y);
     for(char ch:path.toCharArray()){
         if(ch=='N'){
             y++;
         }
         else if(ch=='S'){
             y--;
         }
         else if(ch=='E'){
             x++;
         }
         else{
             x--;
         }
         String tmp=x+","+y;
         //System.out.println(tmp);
         if(visited.contains(tmp)){
             return true;
         }
         else{
             visited.add(tmp);
         }
     }   
     return false;
    }
}