import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int totalElements = 0;

        List<List<Integer>> diagonalLists = new ArrayList<>();

        // Traverse the input 2D array
        for (int row = 0; row < nums.size(); row++) {
            List<Integer> currentRow = nums.get(row);

            for (int col = 0; col < currentRow.size(); col++) {
                int diagonalIndex = row + col;

                // Ensure that the diagonalLists has enough space for the current diagonal
                while (diagonalLists.size() < diagonalIndex + 1) {
                    diagonalLists.add(new ArrayList<>());
                }

                // Add the current element to the appropriate diagonal list
                diagonalLists.get(diagonalIndex).add(currentRow.get(col));

                // Increment the total element count
                totalElements++;
            }
        }

        int[] result = new int[totalElements];
        int resultIndex = 0;

        // Traverse the diagonalLists to populate the result array
        for (List<Integer> diagonalList : diagonalLists) {
            for (int i = diagonalList.size() - 1; i >= 0; i--) {
                result[resultIndex++] = diagonalList.get(i);
            }
        }

        return result;
    }
}
