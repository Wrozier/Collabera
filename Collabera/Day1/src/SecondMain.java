
public class SecondMain {

	public static void main(String[] args) {
	Bicycle bike;
	Account acct;
	
	String myName = "John Java";
	
	bike = new Bicycle( );
	bike.setOwnerName(myName);
	
	acct = new Account ();
	acct.setOwnerName(myName);
	acct.setInitialBalance(250.00);
	
	acct.add(25.00);
	acct.deduct(50);
	
	System.out.println(bike.getOwnerName() + " owns a bike and ");
	System.out.println("has $ " + acct.getCurrentBalance());
	}

}
