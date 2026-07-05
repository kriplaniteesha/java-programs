class SumCLA{
	public static void main(String[] args){
		int n,sum=0,i=0;
		n=args.length;
		System.out.println(n);
		for(i=0;i<n;i++){
			sum=sum+Integer.parseInt(args[i]);
		}
		//string ka length = str.length()   -length is func
		//array ka length = arr.length      -length is prop(variable)
		System.out.println(sum);
	}
}