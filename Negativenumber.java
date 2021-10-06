package demo;

public class Negativenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int negVal=-40;
      if(negVal<0)
      {
    	  int posVal = ~(negVal - 1);
          System.out.println("Negative value converted to Positive = "+posVal);
	   }

}
}