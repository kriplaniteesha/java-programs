//wajp toprint len of all names by user
class NameCLA{
	public static void main(String[] args){
		int i=0;
		for(i=0;i<args.length;i++){
			System.out.println("length of "+args[i]+"is"+args[i].length());
		}
	}
}