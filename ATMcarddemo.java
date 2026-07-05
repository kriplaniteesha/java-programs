class ATMcard{
	private int cardNo;
	private int pin;
	private int balance;
	ATMcard(int cardNo,int pin,int balance){
		this.cardNo=cardNo;
		this.pin=pin;
		if(balance>=0){
			this.balance=balance;
		}
	}
	public void withdraw(int amount){
		if(amount<=balance){
			this.balance=this.balance-amount;
		}
	}
	public void deposit(int amount){
		if(amount>0){
			this.balance=this.balance+amount;
		}
	}
	public int getbalance(){
		return this.balance;
	}
	
}
class ATMcarddemo{
	public static void main(String[] args){
		ATMcard a1=new ATMcard(12,1877,10000);
		a1.withdraw(100);
		System.out.println(a1.getbalance());
		a1.deposit(200);
		System.out.println(a1.getbalance());
		
		
	}
}