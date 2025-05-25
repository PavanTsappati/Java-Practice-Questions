package Java_Prep;

public class RightAngledNumbers {
	
	public static void rights123(int n)
	{
		 for(int i=n;i>0;i--)
		    {
		        for(int j=1;j<=i;j++)
		        {
		            System.out.print(" "+j);
		        }
		        System.out.println();
		    }
	}
	public static void lefts123(int n)
	{
		for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=i;j++)
	        {
	            System.out.print(" "+j);
	        }
	        System.out.println();
	    }
	}

	public static void lefts(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
	        {
	            System.out.print(j+" ");
	        }
	        System.out.println();
		}
		
	}
	public static void rights(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	public static void righ(int n)
	{
		 
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n-i;j++)
	            {
	                System.out.print("  ");
	            }
	            for(int k=i;k>=0;k--)
	            {
	                System.out.print(k+1+" ");
	            }
	            for(int j=2;j<=i+1;j++)
	            {
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }
	}
	
	public static void main(String[] args) {
		
	    rights123(5);
		System.out.println();
		lefts123(5);
		System.out.println();
		lefts(5);
		System.out.println();	
       rights(5);
       System.out.println();	
       
		righ(5);
		
	}

}
