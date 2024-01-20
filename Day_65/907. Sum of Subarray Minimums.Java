class Solution {
    public int sumSubarrayMins(int[] arr) {
       final int MODULO = 1_000_000_007;
    
    int[] stack = new int[arr.length + 1];
    int stackIndex = 0;
    
    int[] minSumArray = new int[arr.length];
    minSumArray[0] = arr[0];
    
    long totalSum = minSumArray[0];
    
    for (int currentIndex = 1; currentIndex < arr.length; currentIndex++) {
        while (stackIndex >= 0 && arr[stack[stackIndex]] >= arr[currentIndex]) {
            stackIndex--;
        }
        
        minSumArray[currentIndex] = (stackIndex < 0) 
            ? arr[currentIndex] * (currentIndex + 1) 
            : minSumArray[stack[stackIndex]] + arr[currentIndex] * (currentIndex - stack[stackIndex]);
        
        totalSum += minSumArray[currentIndex];

        stack[++stackIndex] = currentIndex;
    }

    return (int) (totalSum % MODULO);
    }
}