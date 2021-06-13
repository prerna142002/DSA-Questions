import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t= sc.nextInt();
	    int n,m,l;
	    int a[] = new int[1000001];
	    int c[] = new int[1000001];
	    for(int p=0;p<t;p++)
	    {
	        n=sc.nextInt();
	        m=0;
	        l=(n-1);
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        for(int i=0;i<n;i++)
	        {
	            if(a[i] == 0)
	            {
	                c[m]=0;
	                ++m;
	            }
	            else if(a[i] == 2)
	            {
	                c[l]=2;
	                --l;
	            }
	        }
	        for(int i=m;i<=l;i++)
	        {
	            c[i]=1;
	        }
	        for(int i=0;i<n;i++)
	        {
	            System.out.print(c[i]+" ");
	        }
	        System.out.println();
	    }
	    sc.close();
	}
}
