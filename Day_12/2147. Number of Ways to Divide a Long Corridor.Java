class Solution {
    public int numberOfWays(String corridor) {
        int length = corridor.length();
        int totalSeats = 0;
        int MOD = 1_000_000_007;

        // Count the total number of seats in the corridor
        for (char c : corridor.toCharArray()) {
            if (c == 'S') {
                totalSeats++;
            }
        }

        // Check if there are at least two seats and the total number of seats is even
        if (totalSeats < 2 || totalSeats % 2 != 0) {
            return 0;
        }

        int currentSeatCount = 0;
        int dividerPositions = 1;
        long result = 1;
        boolean isFree = false;

        for (char c : corridor.toCharArray()) {
            if (c == 'S') {
                // If there are divider positions available, update the result
                if (dividerPositions > 0) {
                    result = (result * dividerPositions) % MOD;
                }

                isFree = false;
                currentSeatCount++;
                dividerPositions = 1;

                // Check if the current seat count is even and not the last seat
                if (currentSeatCount % 2 == 0 && currentSeatCount != totalSeats) {
                    isFree = true;
                }
            } else if (isFree) {
                dividerPositions++;
            }
        }

        return (int) (result % MOD);
    }
}
