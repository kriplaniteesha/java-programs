class Figure{
	final float PI =3.14f;
	//square
	public int area(int l){
		return l*l;
	}
	//rectangle
	public int area(int l,int b){
		return l*b;
	}
	//triangle
	public float area(float l,float b){
		return l*b*0.5f;
	}
	//circle
	public float area(float r){
		return PI*r*r;
	}
}
class Areademo{
	public static void main(String[] args){
	Figure s=new Figure();
	System.out.println(s.area(10));
	System.out.println(s.area(10,5));
	System.out.println(s.area(10.0f,5.0f));
	System.out.println(s.area(10.0f));
	}
}