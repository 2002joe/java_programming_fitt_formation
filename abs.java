abstract class bike
{
  bike()
{
  System.out.println("bike is created");
}
  abstract void run();
  void changeGear()
{
  System.out.println("gear changed");
}
  class Honda extends bike
{
  void run()
{
  System.out.println("running safely..");
}
}
  class abs
{
  public static void main(String args[])
{
  bike obj=Honda();
  obj.run();
  obj.changeGear();
}
}
}