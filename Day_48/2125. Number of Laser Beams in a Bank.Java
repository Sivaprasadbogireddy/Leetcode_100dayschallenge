import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numberOfBeams(String[] bank) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0, x = 0;
        for (String b : bank) {
            int devices = noOfDevices(b);
            if (devices == 0) {
                continue;
            }
            res+=x*devices;
            x=devices;
        }
        return res;
    }

    public int noOfDevices(String str) {
        char[] ch = str.toCharArray();
        int count = 0;

        for (char c : ch) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}
