import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		int max = a[0];
		int smax = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			if(a[i]>smax && a[i]<max)
			{
				smax=a[i];
			}
		}
			System.out.print(smax);
	}

}
