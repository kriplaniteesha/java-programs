class SSCStudent{
	int rollno;
	String name;
	double per;
	SSCStudent(int rollno,String name,double per){
		this.rollno=rollno;
		this.name=name;
		this.per=per;
	}
	public void display(){
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(per);
	}
}
class Science extends SSCStudent{
	int p,c,m;
	Science(int rollno,String name,double per,int p,int c,int m){
		super(rollno,name,per);
		this.p=p;
		this.c=c;
		this.m=m;
	}
	public void display(){
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(per);
		System.out.println(p);
		System.out.println(c);
		System.out.println(m);
	}
}
class Override{
	public static void main(String[] args){
	Science s1=new Science(1,"krishna",98,100,78,76);
	s1.display();
	SSCStudent s2=new SSCStudent(2,"krishna",100);
	s2.display();
}}