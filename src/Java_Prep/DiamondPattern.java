package Java_Prep;

public class DiamondPattern
{
    public static void main(String[]args)
    {
	int n=5;
    for(int i=0;i<n;i++)
    {
        for(int j=n-1;j>=i;j--)
        {
            System.out.print(" ");
           
        }
        for(int k=0;k<2*i+1;k++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

         
     for(int i=n;i>=0;i--)
    {
        for(int j=n-1;j>=i;j--)
        {
            System.out.print(" ");
           
        }
        for(int k=0;k<2*i+1;k++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    
    }
} 

