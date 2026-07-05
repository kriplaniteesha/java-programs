class User{
	private String username;
	private String email;
	private boolean isPremiumUser;
	User(String username,String email,boolean isPremiumUser){
		this.username=username;
		this.email=email;
		this.isPremiumUser=isPremiumUser;
	}
	User(String username,String email){
		this.username=username;
		this.email=email;
		this.isPremiumUser=false;
	}
	public boolean isPremiumUser(){
		return isPremiumUser;
	}
}
class Userdemo{
	public static void main(String[] args){
		User u1=new User("Teesha","abc@gmail.com",true);
		if(u1.isPremiumUser())
		{
			System.out.println("user has a premium account");
		}
		else{
			System.out.println("user dosenot have premium account");
		}
		System.out.println(u1.isPremiumUser());
	}
}