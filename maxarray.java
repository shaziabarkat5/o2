import java.util.*;
public class maxarr {

	public static void main(String[] args) {
		int n,max=0;
		System.out.println("enter the size of array :");
		Scanner a = new Scanner(System.in);
		n = a.nextInt();
		int d[] = new int [n];
		max=d[0];
		System.out.println("enter the elements of an array :");
		for(int i=0;i<n;i++)
		{
			d[i]=a.nextInt();
			if(d[i]>max)
			{
				max=d[i];
			}
		}
		System.out.println("the max in array is :");
		System.out.println(max);
		

	}

}
