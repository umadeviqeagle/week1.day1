package demo;

public class Occurence {
    
	public static void main(java.lang.String[] args) 
	{
		String r ="welcome to chennai";
		int count=0;
		char[] chArr=r.toCharArray();
		for(int i=0;i<chArr.length;i++)
		 {
			if(chArr[i]=='e')
             {
	          count=count+1;
             }
		 }
  System.out.println("Count of e:"+count);
	}

}
