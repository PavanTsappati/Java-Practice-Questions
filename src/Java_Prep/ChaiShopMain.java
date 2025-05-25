package Java_Prep;

class owner 
{
	String OwnerName="Animuthyam";
	int OwnerAge=40;
	int OwnerNumber=123;
	class thikka
	{
		String evriki="neeke";
	}
	
}
class Chaishop extends owner
{
	
	String BranchName;
	int CupsHold;
	int PriceperCup;
	
	public Chaishop(String bn,int ch,int ppc) {
		BranchName=bn;
		CupsHold=ch;
		PriceperCup=ppc;		
	}
	void Revenue() {
		System.out.println("Revenue :"+(CupsHold * PriceperCup ));
	}
	public void Display()
	{
		System.out.println("Branch Name :"+BranchName);
		System.out.println("Cups Hold :"+CupsHold);
		System.out.println("Price per Cup :"+PriceperCup);
		Revenue();
	}
}

public class ChaiShopMain {

	public static void main(String[] args) {
		
      
      Chaishop branch1 = new Chaishop("DBS",10,7);
      System.out.println("Name :"+branch1.OwnerName+" Age :"+branch1.OwnerAge+" Number :"+branch1.OwnerNumber);
      branch1.Display();
      Chaishop.thikka th=branch1.new thikka();
      System.out.println("thikka's string :"+th.evriki);
     
	}

}
