class CLAdemo{
	public static void main(String[] args){
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[0]+"+"+args[1]+"="+(args[0]+args[1]));
		//paraseInt is a static method of class integer, it is called for class and not for object
		//converts string to integer
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		System.out.println(num1+num2);
	}
}