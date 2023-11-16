class Product 
{
	public static void main(String[] args) 
	{
		int num=724,pro=1,rem;
		while(num!=0){
			rem=num%10;
			pro=pro*rem;
			num/=10;
		}
		
		System.out.println(pro+"product of a given number");
		
		
	}
}
