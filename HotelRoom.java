class Hotel{
	private int roomNo;
	private boolean isAC;
	private int price;
	Hotel(int roomNo,boolean isAC){
		this.roomNo=roomNo;
		this.isAC=isAC;
		if(this.isAC)
		{this.price=2000;}
	else{
		this.price=1000;
	}
	}
	Hotel(int roomNo){
		this.roomNo=roomNo;
		this.isAC=true;
		this.price=2000;
	}
	public void printdetails(){
		System.out.println("Room no is"+this.roomNo);
		if(this.isAC){
		System.out.println("Room type is Ac");}
		else{
		System.out.println("Price is Non Ac");}
	}
	
}
class HotelRoom{
	public static void main(String[] args){
		Hotel h1=new Hotel(104,false);
		h1.printdetails();
		Hotel h2=new Hotel(504);
		h2.printdetails();
	}
}