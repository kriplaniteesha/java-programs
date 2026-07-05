class Product{
	String productName;
	int price;
	int discountpercent;
	Product(String productName,int price,int discountpercent){
		this.productName=productName;
		this.price=price;
		if(discountpercent>=0 & discountpercent<100){
		this.discountpercent=discountpercent;}
	}
	Product(String productName,int price){
		this.productName=productName;
		this.price=price;
		this.discountpercent=0;
	}
	public int getFinalPrice(){
		return (price - price*discountpercent/100);
	}
}
class Discountdemo{
	public static void main(String[] args){
		Product p1=new Product("moblie",10000,10);
		System.out.println(p1.getFinalPrice());
		Product p2=new Product("moblie",10000,108);
		System.out.println(p2.getFinalPrice());
	}
}