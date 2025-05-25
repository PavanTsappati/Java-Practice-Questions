package Java_Prep;
//Strong Number : Sum Of Factorial of digits of a number;
public class Strong_Number {
	  public static int facto(int n){
	        int fact=1;
	        for(int i=1;i<=n;i++){
	            fact=fact*i;
	        }return fact;
	    }
	    public static Boolean Detect(int n1){
	        int digit,sum=0;
	        int temp=n1;
	        while(temp != 0){
	            digit=temp % 10;
	            sum+=facto(digit);
	            temp/=10;
	        }
	        if(sum==n1){
	            return true;
	        }
	            return false;
	    } 
	 public static void main(String[] args) {
	          int i=145;
	          System.out.println(Detect(i));
	     }
}
	