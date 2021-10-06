package demo;

public class Armstrongnumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 153;
		int number=a;
		int remainder, res = 0,quotient=0,sum=0;
	      while(number!=0)
	      {
	    	  quotient=number/10;
	    	  remainder = number%10;
	    	  number=quotient;
	    	  res=remainder*remainder*remainder;
	    	  sum=sum+res;
	    	  System.out.println(sum);
	    	  System.out.println(number);
	    	  
	      }
	     if(sum==a)
	     {	  
	      System.out.println("This is an armstrong number");
	      }
	      else
	      {
	    	  System.out.println("This is not an armstrong number");
          }
	 }
}
