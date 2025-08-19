class sample
{
    public void iterate()
	{
	   for(var i=0;i<5;i++)
		{
		   System.out.println(i);
		}
	}
}
 
class demo1
{
    public static void main(String ads[])
	{
	  new sample().iterate();
	  var x=10; //var is used only local variable type inference
      System.out.println(((Object) x).getClass().getSimpleName());
      //to print the data type of variable(primitive data type)
	  var price=32.43;
      System.out.println(((Object) price).getClass().getSimpleName());
	  var name="Lec";
      System.out.println(name.getClass().getSimpleName());
      //non-primitive data type
 
	  System.out.println(x);
	  System.out.println(price);
  	  System.out.println(name);
 
	
	}
}