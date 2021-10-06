package demo;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		for(int i=0;i<=data.length-1;i++)
		{
		System.out.println("Element of index"+i+"is:"+data[i]);
		
		}
		System.out.println("2nd Element of index from the last:"+data[data.length-2]);
	}

}
