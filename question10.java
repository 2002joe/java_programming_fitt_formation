import java.util.ArrayList;
import java.util.List;

public class question10 
   {
	   static void findSubsets(int[] arr, int N, int index, List<Integer> currentSubset, List<List<Integer>> result) 
   {
        if (N == 0) 
		{
            result.add(new ArrayList<>(currentSubset));
            return;
        }
        if (index >= arr.length || N < 0)
            return;

        currentSubset.add(arr[index]);
        findSubsets(arr, N - arr[index], index + 1, currentSubset, result);

        currentSubset.remove(currentSubset.size() - 1);
        findSubsets(arr, N, index + 1, currentSubset, result);
    }

    static List<List<Integer>> getAllSubsetsWithSum(int[] arr, int N) 
	{
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(arr, N, 0, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) 
	{
        int[] arr = {1, 2, 3, 4, 5};
        int N = 6;

        List<List<Integer>> subsets = getAllSubsetsWithSum(arr, N);

        if (subsets.isEmpty()) 
		{
            System.out.println("No subsets found with sum equal to " + N);
        } 
		else {
            System.out.println("Subsets with sum equal to " + N + ":");
            for (List<Integer> subset : subsets) 
			{
                System.out.println(subset);
            }
        }
    }
}
