class strfns
{
public static void main(String[]args)
{
//CHARAT 
String s="I love southkorea seoul";
System.out.println(s.charAt(10));

//CONTAINS
String p="WHERE THERE IS THE WILL THERE IS A HOPE";
System.out.println(p.contains("WAY"));
System.out.println(p.contains("POWER"));

//EQUALS
String sq="java";
String s1="JAVA";
String s2="Program";
String s3="Welcome";
System.out.println(sq.equals(s1));
System.out.println(sq.equals(s2));
System.out.println(sq.equals(s3));

//EQUALSIGNORE CASE
String t="PROGRAM";
String t1="Dotnet";
String t2="program";
String t3="Dom";
System.out.println(t.equalsIgnoreCase(t1));
System.out.println(t.equalsIgnoreCase(t2));
System.out.println(t.equalsIgnoreCase(t3));

//SPLIT
String pm="THE SELFISH GAINT-TRESPASSERS PROSECUTION";
String[]b=pm.split("");
for (int i=0;i<b.length;i++)
{
	System.out.println(b[i]);
}

//LENGTH
String rm="THE CARTISIAN EQUATION";
System.out.println(rm.length());
}
}
