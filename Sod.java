class Sod{
	public static void main(String[] args){
		int num,digit,sum=0;
		num=365;
		while(num!=0){
			digit=num%10;
			num=num/10;
			sum=sum+digit;
		}
		System.out.println(sum);
		}	
	}