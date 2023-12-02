public class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> loses = new HashMap<>();
        Set<Integer> num = new HashSet<>();

        // Count the number of losses for each player
        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            loses.put(loser, loses.getOrDefault(loser, 0) + 1);

            num.add(winner);
            num.add(loser);
        }

        List<Integer> noLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (int player : num) {
            int lossCount = loses.getOrDefault(player, 0);
            if (lossCount == 0) {
                noLoss.add(player);
            } else if (lossCount == 1) {
                oneLoss.add(player);
            }
        }

        Collections.sort(noLoss);
        Collections.sort(oneLoss);

        List<List<Integer>> result = new ArrayList<>();
        result.add(noLoss);
        result.add(oneLoss);

        return result;
    }
}
