package demo;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int input=49;
    int n=input/2;
    boolean flag=false;
    for(int i=2;i<n;i++)
    {
    	int rem;
    	rem=input%i;
    	if(rem==0)
    	{	
    	flag=true;
        }
    }
    	if(flag==false)
    	{
    		System.out.println("Prime no");
    	}
    
    	else
    	{
    		System.out.println("Not a prime no");
    	}
    		
	}

}
