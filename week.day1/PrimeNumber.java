package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
	int num=9;
	int temp=0;
	for(int i=2;i<=num-1;i++)
	{
		if (num%10==0)
		{
			temp=temp+1;
		}
	}
	
	if(temp>0) {
		System.out.println("Not a prime Number");
	}
	
	else
	{
		System.out.println("It is a prime number");
	}
	}
}
