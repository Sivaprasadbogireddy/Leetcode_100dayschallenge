class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 4) {
                return key;
            }
        }

        return -1; 
    }
}
