import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int a[] =new int[1000];
		for(int p=0;p<t;p++)
		{
			int n=sc.nextInt();
			int b[] =new int[1000];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			if(n>1)
			{
				int l=a[n-1];
				for(int i=1;i<n;i++)
				{
					b[i]=a[i-1];
				}
				b[0]=l;
				for(int i=0;i<n;i++)
				{
					System.out.print(b[i]+" ");
				}
			}
			else
			{
				System.out.print(a[0]);
			}
			
			System.out.println();
		}
		sc.close();
	}
}
