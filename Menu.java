class Menu{
	public static void main(String[] args){
	int choice=2,num1=5,num2=5;
	System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.division\n5.remainder");
	switch(choice)
	{
		case 1:System.out.println(num1+num2);
		break;
		case 2:System.out.println(num1-num2);
		break;
		case 3:System.out.println(num1*num2);
		break;
		case 4:System.out.println(num1/num2);
		break;
		case 5:System.out.println(num1%num2);
		break;
		
	}
	}
	}