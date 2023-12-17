import java.util.HashMap;
import java.util.PriorityQueue;

public class FoodRatings {

    private class FoodInfo {
        String foodName;
        int foodIndex;
        int foodRating;

        public FoodInfo(String food, int index, int rating) {
            foodName = food;
            foodIndex = index;
            foodRating = rating;
        }
    }

    private HashMap<String, Integer> foodIndexMap;
    private HashMap<String, PriorityQueue<FoodInfo>> cuisineRatingsMap;
    private int[] ratingsArray;
    private String[] foodNamesArray;
    private String[] cuisineNamesArray;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodIndexMap = new HashMap<>();
        cuisineRatingsMap = new HashMap<>();
        ratingsArray = ratings;
        foodNamesArray = foods;
        cuisineNamesArray = cuisines;

        for (int i = 0; i < foods.length; i++) {
            cuisineRatingsMap.putIfAbsent(cuisines[i], new PriorityQueue<>(
                    (a, b) -> b.foodRating == a.foodRating ? a.foodName.compareTo(b.foodName) : b.foodRating - a.foodRating));
            cuisineRatingsMap.get(cuisines[i]).offer(new FoodInfo(foods[i], i, ratings[i]));
            foodIndexMap.put(foods[i], i);
        }
    }

    public void changeRating(String food, int newRating) {
        int index = foodIndexMap.get(food);
        ratingsArray[index] = newRating;
        String cuisine = cuisineNamesArray[index];
        cuisineRatingsMap.get(cuisine).offer(new FoodInfo(foodNamesArray[index], index, newRating));
    }

    public String highestRated(String cuisine) {
        PriorityQueue<FoodInfo> cuisineQueue = cuisineRatingsMap.get(cuisine);
        while (ratingsArray[cuisineQueue.peek().foodIndex] != cuisineQueue.peek().foodRating) {
            cuisineQueue.poll();
        }
        return cuisineQueue.peek().foodName;
    }
}


/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */