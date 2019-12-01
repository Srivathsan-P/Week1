package week1.day1;

public class FibonacciNumber {

	public static void main(String[] args) {
		int firstNum=0;
		int secNum=1;
		int thirdNum;
		int range=8;
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for(int i=2;i<=range;i++)
			{
			thirdNum=firstNum+secNum;
			System.out.println(thirdNum);
			firstNum=secNum;
			secNum=thirdNum;
			}
		

	}

}
