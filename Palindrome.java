package demo;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String word="madam";
      String rev="";
      //char[] chArr=word.toCharArray();
      //rev=rev+word;
 	 //System.out.println(rev);
      for( int i =word.length()-1; i >= 0; i-- )
      {
    	 char[] ch=word.toCharArray();
    	  rev=rev+ch[i];
    	  System.out.println(rev);
      }
    	  
    	  if(rev.equalsIgnoreCase(word))
    	  {
    		  System.out.println("Palindrome");
    	  }
    	  else
    	  {
    		  System.out.println("Not a Palindrome"); 
    	  }
    		  
      
	}

}
