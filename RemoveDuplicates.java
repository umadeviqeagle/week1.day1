package demo;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
Set<Integer> newset=new HashSet<Integer>();
for(int i=0;i<arr.length;i++)
{
	newset.add(arr[i]);
	
	
}
System.out.println(newset);

	}

}
