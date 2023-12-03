class Solution {
  public int minTimeToVisitAllPoints(int[][] points) {
    int time = 0;
    for (int i = 1; i < points.length; i++) {
      int[] currentPoint = points[i];
      int[] previousPoint = points[i - 1];
      int r=Math.max(Math.abs(currentPoint[0] - previousPoint[0]),Math.abs(currentPoint[1] - previousPoint[1]));
        time+=r;
    }
    return time;
  }
}
