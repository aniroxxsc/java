class Fibo{
	public static void main(String args[])
	{
		int b=1;
		int sum=0;
		int temp;
		int n= Integer.parseInt(args[0]);
		System.out.println(sum + " , " + b);
		for(int i=0;i<n;i++){
			temp=b;
			b= sum+b;
			sum=temp;
			System.out.println(b);
		}
	}
}
