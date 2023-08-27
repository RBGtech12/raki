package methods;

public class Array2B {

	public static void main(String[] args)
	{
		int i=1;
		System.out.println("even numbers  from 1 to 100");

		for( i=1;i<=100;i++)

		{
			if(i%2==0)
			{
			System.out.println(i++);	
			}	}
			
		System.out.println("even numbers return from 100 to 1");

			int j=100; int k=1;
			for(j=100;j>=k;j--)
			{
			if(j%2==0)
			{
			System.out.println(j--);
			}}
			
			System.out.println("even numbers  from 100 to 150");

			int l=100; 
			for(l=100;l<=150;l++)
			{
			if(l%2==0)
			{
				System.out.println(l++);
			}}
			
			System.out.println("even numbers return from 150 to 100");

			int m=150; int n=100;
			for(m=150;m>=n;m--)
			{
				if(m%2==0)
				{
					System.out.println(m--);
			}}
			
			
	}
	}

