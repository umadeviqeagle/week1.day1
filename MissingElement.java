package demo;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=1;i<=arr.length;i++)
		{
			if(i!=arr[i-1])
			{
				System.out.println("missing element:"+i);
				break;
		}

}

	}}


