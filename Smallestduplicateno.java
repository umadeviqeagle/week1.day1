package demo;

import java.util.Arrays;

public class Smallestduplicateno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,3,7,2,7,2,1};
		Arrays.sort(arr);
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2==0)
			{
				System.out.println("smallest duplicate no:" +i);
			}
			else
			{
				System.out.println(i);
			}
		}
	}

}
