package demo;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int count=0;
         String test = "changeme";
         char[] chArr=test.toCharArray();
         for(int i=0;i<chArr.length;i++)
         {
         if(i%2==0)
        	 {
        	chArr[i]=Character.toUpperCase(chArr[i]);
        	 //0System.out.println(UpchArr);
        	 }
         }
        System.out.println(chArr);	
         
}}