package Data_Structures;

public class Diagnolsin2DArray {

	public static void main(String[] args) {
		int[][]arr= {{1,2,3,4},{4,5,6,8},{7,8,9,6}};
        int r=arr.length;
        int c=arr[0].length;
        System.out.println(r+" "+c);
     
//        //For Loop:
//        
//        //Diagnol :
//        
//        for(int i=0;i<r;i++)
//        {
//        	System.out.println(arr[i][i]);
//        }
//        
//        // Reverse Diagnol :
//        
//        for(int i=0;i<r;i++)
//        {
//        	int j=c-i-1;
//        	System.out.println(arr[i][j]);
//        }
//       
//        //While Loop:
//        
//        // Diagnol :
//        
//		int i=0,j=0;
//        while(i<r && i<c)
//        {
//        	System.out.println(arr[i][j]);
//        	i++;
//        	j++;
//        }
//        int k=0,n=c-1;
//        
//        // Reverse Diagnol :
//        while(k<r && n<c)
//        {
//        	System.out.println(arr[k][n]);
//        	k++;
//        	n--;
//        }
//        
//        //Second index Diagnol :
         int i=0,k=i+1;
         while(i<r && k<c)
         {
        	 System.out.println(arr[i][k]);
        	 i++;
        	 k++;
         }
	}

}
