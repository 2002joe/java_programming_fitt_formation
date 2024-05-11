public class question11 {
    static String reverseWordsAfterString(String str1, String str2)
	{
        int index = str1.indexOf(str2);
        if (index == -1) 
		{
            return str1;
        }

        String substring = str1.substring(index + str2.length());
		String[] words = substring.split("\\s+");
        StringBuilder reversedSubstring = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSubstring.append(words[i]);
            if (i > 0) {
                reversedSubstring.append(" ");
            }
        }

        
        StringBuilder result = new StringBuilder(str1.substring(0, index + str2.length()));
        result.append(reversedSubstring);

        return result.toString();
    }

    public static void main(String[] args) {
        String string1 = "This is a test String only";
        String string2 = "st";

        String result = reverseWordsAfterString(string1, string2);
        System.out.println("Output: " + result);
    }
}
