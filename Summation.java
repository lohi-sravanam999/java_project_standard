class Summation 
{
	public static void main(String[] args) 
	{
		int num=724,sum=0,rem;
		while(num!=0){
			rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		
		System.out.println(sum+"summation of a given number");
		
		
	}
}
