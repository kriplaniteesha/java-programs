// WAJP to create a class Account with member variables(accountid, accountname, amount)
// Create 2 instances of class Account
// Ensure good encapsulation technique
class Account{
	private int accountid;
	private String name;
	private int amount;
	public int getAccountid(){
		return this.accountid;
	}
	public String getName(){
		return this.name;
	}
	public int getAmount(){
		return this.amount;
	}
	public void setAccountid(int accountid){
		this.accountid=accountid;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAmount(int amount){
		if(amount>=0){
			this.amount=amount;
			}
	}
}
class AccountDemo{
	public static void main(String[] args){
		Account a1=new Account();
		Account a2=new Account();
		a1.setAccountid(1);
		a1.setName("teesha");
		a1.setAmount(1000);
		a2.setAccountid(2);
		a2.setName("krishna");
		a2.setAmount(2000);
		System.out.println(a1.getAccountid());
		System.out.println(a1.getName());
		System.out.println(a1.getAmount());
		
		}
}