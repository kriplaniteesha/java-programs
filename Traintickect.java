class Train{
		String passengerName;
		int trainNo;
		String seatType;
		int fare;
		Train(String passengerName,int trainNo,String seatType){
		this.passengerName=passengerName;
		this.trainNo=trainNo;
		if(seatType=="AC" || seatType=="Sleeper"){
		this.seatType=seatType;}
		else{
			System.out.println("pls enter a valid seattype");
		}
		if(this.seatType=="AC"){
			this.fare=300;
		}
		if(seatType=="sleeper"){
			this.fare=150;
		}
		}
		Train(String passengerName,int trainNo){
		this.passengerName=passengerName;
		this.trainNo=trainNo;
		this.seatType="sleeper";
		this.fare=150;
		}
		public int getfare(){
			return this.fare;
		}
		
}
class Traintickect{
	public static void main(String[] args){
		Train t1=new Train("teesha",25021,"AC");
		System.out.println(t1.getfare());
		Train t2=new Train("yash",25021);
		System.out.println(t2.getfare());
		Train t3=new Train("krishna",25021,"anything");
		System.out.println(t3.getfare());
		
	}
}