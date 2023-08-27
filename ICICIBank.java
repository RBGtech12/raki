package inheritancedemo;

public class ICICIBank extends RBIBank
{
	ICICIBank()
	{
		System.out.println("cons of ICICIBank");
	}

	public static void main(String[] args) 
	{
		ICICIBank t1=new ICICIBank();
		t1.cBillScore();
	}

}
