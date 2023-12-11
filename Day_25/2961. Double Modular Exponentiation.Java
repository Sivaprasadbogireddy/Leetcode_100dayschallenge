import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < variables.length; i++) {
            int[] tmp = variables[i];
            long a1 = modularExponentiation(tmp[0], tmp[1], 10);
            long a2 = modularExponentiation(a1, tmp[2], tmp[3]);
            int val = (int) (a2 % tmp[3]);

            if (target == val) {
                res.add(i);
            }
        }

        return res;
    }

    private long modularExponentiation(long base, long exponent, long modulus) {
        long result = 1;
        base = base % modulus;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }
            base = (base * base) % modulus;
            exponent /= 2;
        }

        return result;
    }
}
