package Sample_code;

public class Q14Bank {
	 int accountNumber;
	    String holderName;
	    double balance;
	    static String bankName;
	    static double interestRate;

	    static {
	        bankName = "State Bank of India";
	        interestRate = 4.5;
	    }

	    Q14Bank(int accountNumber, String holderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	    }

	    static void changeInterestRate(double newRate) {
	        interestRate = newRate;
	    }

	    void deposit(double amount) {
	        this.balance += amount;
	    }

	    void withdraw(double amount) {
	        if (this.balance >= amount) {
	            this.balance -= amount;
	        } else {
	            System.out.println("Insufficient balance for " + this.holderName);
	        }
	    }

	    void display() {
	        System.out.println("Bank: " + bankName + 
	                           ", Account: " + this.accountNumber + 
	                           ", Holder: " + this.holderName + 
	                           ", Balance: " + this.balance + 
	                           ", Interest Rate: " + interestRate + "%");
	    }

	    public static void main(String[] args) {
	        Q14Bank acc1 = new Q14Bank(101, "GIRIDHAR", 5000);
	        Q14Bank acc2 = new Q14Bank(102, "MADHU", 3000);

	        acc1.deposit(2000);
	        acc2.withdraw(1000);

	        acc1.display();
	        acc2.display();

	        Q14Bank.changeInterestRate(6.0);

	        acc1.display();
	        acc2.display();
	    }

}
