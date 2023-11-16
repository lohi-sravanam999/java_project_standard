class Spy 
{
	public static void main(String[] args) 
	{
		int num=132,pro=1,sum=0,rem;
		while(num!=0){
			rem=num%10;
			sum=sum+rem;
			pro=pro*rem;
			num/=10;
		}
		if(sum==pro){
		
		System.out.println("it is a spy number");
		}
		else{
		System.out.println("it is not a spy number");
		}

		
		
	}
}