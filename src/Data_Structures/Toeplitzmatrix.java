package Data_Structures;

public class Toeplitzmatrix {
	
public static boolean Isvalid(int[][] matrix,int x,int y){
        int r=matrix.length;
        int c= matrix[0].length;
        int i=x;
        int j=y;
        int temp=matrix[i][j];
        boolean valid=true;
        while(i<r && j<c){
          if(matrix[i][j] != temp){
            valid=false;
          }
          i++;
          j++;
        }
        return valid;
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        boolean ans=true;
        int r= matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<c;i++){
            boolean temp=Isvalid(matrix,0,i);
            if(!temp){
                ans=false;
                break;
            }
        }
        for(int j=1;j<r;j++){
            boolean temp=Isvalid(matrix,j,0);
            if(!temp){
                ans=false;
                break;
            }
        }
        return ans;
    }

   public static void main(String[]args)
   {
	   int[] [] arr= {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
	   boolean temp=isToeplitzMatrix(arr);
	   System.out.println(temp);
   }
}