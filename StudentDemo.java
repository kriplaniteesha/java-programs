class Student{
	int rollno;
	String name;
	static int count=0;
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
		count++;
	}
}
class StudentDemo{
	public static void main(String[] args){
		Student s1=new Student(1,"teesha");
		System.out.println(Student.count);
		System.out.println(Student.count);
		Student s3=new Student(1,"preeti");
		System.out.println(Student.count);
		Student s4=new Student(1,"anand");
		System.out.println(Student.count);
		Student s5=new Student(1,"krishna");
		System.out.println(Student.count);
		
	}
}