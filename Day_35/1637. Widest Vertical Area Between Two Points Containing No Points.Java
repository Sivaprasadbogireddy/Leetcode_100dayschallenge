class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] px=new int[points.length];
        for(int i=0;i<points.length;i++){
            px[i]=points[i][0];
        }
        Arrays.sort(px);
        int res=0;
        for(int i=0;i<px.length-1;i++){
            if(res<px[i+1]-px[i]){
                res=px[i+1]-px[i];
            }
        }
        return res;
    }
}