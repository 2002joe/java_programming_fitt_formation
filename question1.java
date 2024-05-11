
class question1 { 
	
	static void nextGreatest(int arr[], int n) 
	{ 
		for (int i = 0; i < n; i++) { 
			int max_value = -1; 
			for (int j = i + 1; j < n; j++) { 
				max_value = Math.max(max_value, arr[j]); 
			} 
			arr[i] = max_value; 
		} 
	} 

	
	static void printArray(int arr[], int size) 
	{ 
		for (int i = 0; i < size; i++) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	
	public static void main(String[] args) 
	{ 
		int arr[] = { 16, 17, 4, 3, 5, 2 }; 
		int size = arr.length; 
		nextGreatest(arr, size); 
		System.out.println("The modified array is: "); 
		printArray(arr, size); 
	} 
}
