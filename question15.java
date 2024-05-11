import java.util.Arrays;

public class question15
   {
    public static void main(String[] args) 
	 {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        
        Arrays.sort(arr);

        
        int[] result = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) 
		{
            if (i % 2 == 0) {
                result[i] = arr[right];
                right--;
            } else {
                result[i] = arr[left];
                left++;
            }
        }

        
        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Output: " + Arrays.toString(result));
    }
}
