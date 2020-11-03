package Armstrong;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args)
	{
		System.out.println(armstrong(153));
		System.out.println(armstrong(121));
		
	}

	public static boolean armstrong(int n) 
	{
		Scanner s=new Scanner(System.in);
		//int n=s.nextInt();
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum)
		{
			return true;
		}
		return false;
		
	}

}
