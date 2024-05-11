public class question8 {
    public static String removeDuplicate(String input) 
	{
        char[] charArray = input.toCharArray();
        boolean foundUpperCase = false;
        boolean foundLowerCase = false;
        boolean foundDigit = false;

        for (int i = 0; i < charArray.length; i++) 
		{
            char currentChar = charArray[i];
            if (Character.isUpperCase(currentChar)) 
			{
                if (foundUpperCase) 
				{
                    charArray[i] = 'C'; 
                }
                foundUpperCase = true;
            } 
			else if (Character.isLowerCase(currentChar)) 
			{
                if (foundLowerCase) 
				{
                    charArray[i] = 'c'; 
                }
                foundLowerCase = true;
            } 
			else if (Character.isDigit(currentChar)) 
			{
                if (foundDigit) 
				{
                    charArray[i] = (char) (charArray[i] == '9' ? '0' : charArray[i] + 1);
                }
                foundDigit = true;
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) 
	{
        String input = "aBuzZ9900";
        String output = removeDuplicate(input);
        System.out.println("Output: " + output);
    }
}
