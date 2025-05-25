package Data_Structures;

public class DiagnolOperationsof2DArrays {

	public static boolean ifDiagnolsare1(int [][] arr)
    {
       int r= arr.length;
       int c=arr[0].length;
       int i=0,j=0;
       boolean status =true;
       while(i<r && j<c)
       {
    	  
          if(arr[i][j]!=1)
          {
              System.out.println(arr[i][j]);
              status= false;
          }
          
          i++;
          j++;
       }
       return status;
    }   
	public static boolean SameDiagnalsornot(int [][] arr)
    {
       int r= arr.length;
       int c=arr[0].length;
       int i=0,j=0;
       boolean status =true;
       int temp=arr[i][j];
       while(i<r && j<c)
       {
    	  
          if(arr[i][j] != temp)
          {
              System.out.println(arr[i][j]);
              status= false;
          }
          
          i++;
          j++;
       }
       return status;
    }   
	public static boolean SameDiagnalsornotof1(int [][] arr)
    {
       int r= arr.length;
       int c=arr[0].length;
       int i=0,j=1;
       boolean status =true;
       int temp=arr[i][j];
       while(i<r && j<c)
       {
    	  
          if(arr[i][j] != temp)
          {
//              System.out.println(arr[i][j]);
              status= false;
          }
          System.out.println(arr[i][j]);
          i++;
          j++;
       }
       return status;
    }   
    public static void main(String[] args) {
       int[][] arr={{1,2,3,11},{4,1,2,12},{7,8,1,2}};
       int r= arr.length;
       int c=arr[0].length;
//       boolean status =ifDiagnolsare1(arr);
//       System.out.println(status);
//       boolean status2=SameDiagnalsornot(arr);
//       System.out.print(status2);
       boolean status3=SameDiagnalsornotof1(arr);
       System.out.print(status3);
    }
}
