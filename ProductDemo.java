class Product{
	private int id;
	private String name;
	private int quantity;
	Product(int id,String name,int quantity){
		this.id=id;
		this.name=name;
		this.quantity=quantity;
	}
	Product(int id,String name){
		this.id=id;
		this.name=name;
		this.quantity=0;
	}
	Product(){
		this.id=0;
		this.name=null;
		this.quantity=0;
	}
	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public int getQuantity(){
		return this.quantity;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setQuantity(int quantity){
		if(quantity>=0){
			this.quantity=quantity;
	}
}
}
class ProductDemo{
public static void main(String[] args){
	Product p1=new Product();
	System.out.println(p1.getId());
	System.out.println(p1.getName());
	System.out.println(p1.getQuantity());
	Product p2=new Product(1,"laptop");
	System.out.println(p2.getId());
	System.out.println(p2.getName());
	System.out.println(p2.getQuantity());
	Product p3=new Product(2,"mobile",4);
	System.out.println(p3.getId());
	System.out.println(p3.getName());
	System.out.println(p3.getQuantity());
	
	
	
}
}