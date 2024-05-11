import java.util.Scanner;

public class question13 
   {
    static String interleaveStrings(String str1, String str2) 
	{
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(str1.length(), str2.length());

        for (int i = 0; i < maxLength; i++) 
		{
            if (i < str1.length()) 
			{
                result.append(str1.charAt(i));
            }
            if (i < str2.length()) 
			{
                result.append(str2.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            String result = interleaveStrings(str1, str2);
            System.out.println(result);
        }

        scanner.close();
    }
}
