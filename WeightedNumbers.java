import java.util.*;

public class WeightedNumbers {
    
    // Function to calculate weight of a number based on given conditions
    public static int calculateWeight(int num) {
        int weight = 0;
        
        // Condition 1: 5 if a perfect square
        if (isPerfectSquare(num)) {
            weight += 5;
        }
        
        // Condition 2: 4 if multiple of 4 and divisible by 6
        if (num % 4 == 0 && num % 6 == 0) {
            weight += 4;
        }
        
        // Condition 3: 3 if even number
        if (num % 2 == 0) {
            weight += 3;
        }
        
        return weight;
    }
    
    // Function to check if a number is a perfect square
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    
    public static void main(String[] args) {
        int[] numbers = {10, 36, 54, 89, 12};
        Map<Integer, Integer> weightedNumbers = new TreeMap<>();
        
        // Calculate weights for each number and store in a map
        for (int num : numbers) {
            int weight = calculateWeight(num);
            weightedNumbers.put(num, weight);
        }
        
        // Sort the map by values (weights)
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(weightedNumbers.entrySet());
        Collections.sort(sortedEntries, Comparator.comparing(Map.Entry::getValue));
        
        // Print the sorted numbers with their weights
        System.out.print("<");
        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            System.out.print(entry.getKey() + "," + entry.getValue() + ">");
            if (entry != sortedEntries.get(sortedEntries.size() - 1)) {
                System.out.print(",");
            }
        }
    }
}
