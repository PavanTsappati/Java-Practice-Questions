package Java_Prep;

public class StraightAndReverseBokkaKonda 
{

	public static void main(String[] args) 
	{
		 int n=5;
		  
		  for(int i=0;i<n-1;i++)
		  {
			  for(int j=0;j<n-i-1;j++)
			  {
				  System.out.print(" ");
			  }
			  for(int k=0;k<2*i+1;k++)
	         {
				  if(k==0 || k==2*i )
				  {
				  System.out.print("*");
				  }
				  else
				  {
					  System.out.print(" ");
				  }
	          }
			  
			  System.out.println();
		   }
		  
		    for(int i=n-1;i>=0;i--)
		    {
			  for(int j=0;j<n-i-1;j++)
			  {
			      System.out.print(" ");
			      
			  }
			  for(int k=0;k<2*i+1;k++)
			  {
			      if(k==0 || k==2*i )
			      {
			          System.out.print("*");
			      }
			      else
			      {
			          System.out.print(" ");
			      }
			  }
			  
			  System.out.println();	  
			  
		    }
		    
	}

}
