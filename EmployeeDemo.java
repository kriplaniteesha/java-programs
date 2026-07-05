class Employee{
	private String name;
	private int salary;
	Employee(String name,int salary){//contrustor parameterised
		this.name=name;
		this.salary=salary;
	}
	Employee(){
		this.name=null;
		this.salary=0;
	}
	public String getName(){
		return this.name;
	}
	public int getSalary(){
		return this.salary;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSalary(int salary){
		if(salary>=0){
			this.salary=salary;
			}
	}
}
class EmployeeDemo{
	public static void main(String[] args){
		Employee e1=new Employee();
		e1.setName("teesha");
		e1.setSalary(1000);
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
	}
}