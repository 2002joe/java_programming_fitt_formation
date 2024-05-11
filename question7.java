public class question7 {
    public static String removeDuplicate(String input)
	{
        char[] charArray = input.toCharArray();
        int firstDuplicateIndex = -1;

        
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charArray[0]) {
                firstDuplicateIndex = i;
                break;
            }
        }

        
        charArray[firstDuplicateIndex] = (char) (charArray[firstDuplicateIndex] + 1);
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charArray[firstDuplicateIndex]) {
                charArray[i] = (char) (charArray[i] + 1);
                break;
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "Python1223";
        String output = removeDuplicate(input);
        System.out.println("Output: " + output);
    }
}
