import java.util.Scanner;
class CrossPattern
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = in.nextLine();
        int length = word.length();
       
        char[][] matrix = new char[length][length];
       
        for(int i=0; i<length; i++)
            matrix[i][i] = word.charAt(i);
       
        for(int i=0,j=(length-1); i<length; i++,j--)
            matrix[i][j] = word.charAt(i);
       
        for(int i=0; i<length; i++)
        {
            for(int j=0; j<length; j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }  
    }
   
}