package OOP;

public class HDFC implements Bank{
	private String name;
	private final String accountNumber;
	private String balance;
	HDFC(String name, String accountNumber){
		this.name = name;
		this.accountNumber = accountNumber;
	}

	@Override
	String getBalance(){
		return this.balance;
	}

	@Override
	void Pay(Bank bank){
		System.out.println("Payment Made");
	}

	@Override
	String getInfo(){
		System.out.prinlnt("This is your account Bitch!");
	}
}
