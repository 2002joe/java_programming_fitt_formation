public class question3 {
    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        
        for (int num : arr) {
            totalSum += num;
        }

        
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            
            if (leftSum == totalSum) {
                return i;
            }
            
            leftSum += arr[i];
        }
        
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr1 = {-7, 1, 5, 2, -4, 3, 0};
        int[] arr2 = {1, 2, 3};
        
        System.out.println("Output for arr1: " + findEquilibriumIndex(arr1)); 
        System.out.println("Output for arr2: " + findEquilibriumIndex(arr2));
    }
}
