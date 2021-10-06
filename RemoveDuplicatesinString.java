package demo;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "We learn java basics as part of java sessions in java week1";
		String[] word = s.split(" ");
		// char[] chArr=s.toCharArray();
		int count;
		for (int i = 0; i < word.length; i++) 
			{
				for(int j=0+1;j<word.length;j++)
				{	
					if(word[i].equals(word[j]))
						
					 {
				
				System.out.println(word[i]);
				}
			}
		}

	}
}


