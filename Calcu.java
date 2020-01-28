class Calcu{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		int c=Integer.parseInt(args[2]);
		float out;
		if(args[1].equals("+")){
			out = a+c;
			System.out.println(out);	
		} 
		if(args[1].equals("-")){
			out = a-c;
			System.out.println(out);
		}
		if(args[1].equals("X")){
			out = a*c;
			System.out.println(out);
		}
		if(args[1].equals("/")){
			out=a/c;
			System.out.println(out);
		}
	}
}
