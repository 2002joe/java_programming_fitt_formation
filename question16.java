import java.util.Arrays;

public class question16 {
    static int minTrips(int[] persons, int K) {
        Arrays.sort(persons); // Sort the persons array in ascending order
        int trips = 0;
        int left = 0;
        int right = persons.length - 1;

        while (left <= right) {
            if (persons[left] + persons[right] <= K) {
                left++;
            }
            right--;
            trips++;
        }

        return trips;
    }

    public static void main(String[] args) {
        int[] persons = {90, 85, 75, 60, 120, 150, 125};
        int K = 200;

        int trips = minTrips(persons, K);
        System.out.println("Least number of trips: " + trips);
    }
}
