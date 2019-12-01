package week1.day1;

public class AmstrongNumber {
	public static void main(String[]args)
	{
      //Logic to find the length of the given number
     int no =153;
     int t1=no;
     int length=0;
     
     while(t1!=0)
     {
    	t1= t1/10;
    	 length++;
     }

     //Logic to multiply the number and add it.
     
     int t2= no;
     int arm=0;
     int rem;
     
     while(t2!=0)
     {
    	 rem=t2/10;
    	 int mul=1;
     for(int i=1;i<=length;i++) 
     {
    	 mul=mul*rem;
     }
         arm=arm+mul;
         t2=t2/10;
     }
     if(no==arm) 
     {
    	 System.out.println("The given number is armstrong number:"+no);
     }
     else
     {
    	 System.out.println("The given number is not an armstrong number");
     }  
     
     }
     }

