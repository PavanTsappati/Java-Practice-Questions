package Data_Structures;

public class Arrays2D {

	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{4,5,6}};
//		System.out.println(arr[0][4]);
		int r=arr.length;
//		System.out.println(r);
		int c=arr[0].length;
//		System.out.println(c);
//		arr[0][0]=7;
//		for(int i=0;i<r;i++)
//		{
//			for(int j=0;j<c;j++)
//			{
//				System.out.print(arr[i][j]+"\n");
//			}
//		}
    	for(int i=0;i<c;i++) {
			System.out.println(arr[1][i]);
		}
		for(int i=0;i<r;i++) {
			System.out.println(arr[i][0]);
		}
//		
	}

}
