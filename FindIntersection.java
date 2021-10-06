package demo;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numarr1={3,2,11,4,6,7};
int[] numarr2={1,2,8,4,9,7};
for(int i=0;i<numarr1.length;i++)
{
	for(int j=0;j<numarr2.length;j++)
	{
		if(numarr1[i]==numarr2[j])
		{
			System.out.println(numarr1[i]);
		}
	}
}

	}

}
