package week1.day1;

public class Mobile {
	public String text()
	{
		return "Hey";
	}
  public long call()
  {
	  return 9884483749l;
  }
public void shutdown()
{
	System.out.println("Shutdown the mobile");
}
public static void main(String[]args)
{
	Mobile phone=new Mobile();
	System.out.println(phone.call());
 System.out.println(phone.text());
 
	phone.shutdown();
}
}

