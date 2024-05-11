class strrev
{
    public static void main(String[]args)
{
    String s="Master in java program",s1="";
    char[] a= s.toCharArray();
    for(int i= a.length-1;i>=0;i--)
{
    s1=s1+a[i];
}
 System.out.println("Reverse of the given string");
}
}