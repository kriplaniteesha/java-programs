class Prime{
	public static void main(String[] args){
		int num=7,i;
		boolean ans=true;
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{ans=false;}
		}
		if(ans==true)
		{System.out.println("prime no");}
		else
		{System.out.println("not prime");}
	}
}