class Box{
	private float length;
	private float breath;
	private float height;
	Box(float length ,float breath,float height){
		this.length=length;
		this.breath=breath;
		this.height=height;
	}
	Box(float length){
		this.length=length;
		this.breath=length;
		this.height=length;
	}
	Box(){
		this.length=1;
		this.breath=1;
		this.height=1;
	}
	public float getLength(){
		return this.length;
	}
	public float getBreath(){
		return this.breath;
	}
	public float getHeight(){
		return this.height;
	}
	public void setLength(float length){
		this.length=length;
	}
	public void setBreath(float breath){
		this.breath=breath;
	}
	public void setHeight(float height){
			this.height=height;
	}
	float Calculatearea(){
		return this.length*this.breath;
	}
}
class BoxDemo{
	public static void main(String[] args){
		Box b1=new Box(1,2,3);
		System.out.println(b1.getLength());
		System.out.println(b1.Calculatearea());
		
	}
}