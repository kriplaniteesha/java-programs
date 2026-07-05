class Fibbo{
	public static void main(String[] args){
		int f0,f1,f2,n;
		f0=0;
		f1=1;
		f2=0;
		n=5;
		System.out.println(f0+"\n"+f1);
		while(f2!=n)
		{
			f2=f0+f1;
			System.out.println("\n"+f2);
			f0=f1;
			f1=f2;
		}
		
	}
}