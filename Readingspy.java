class Readingspy 
{
	public static void main(String[] args) 
	{
		int num=132,sum=0,pro=1,count=0,rem;
		while(num!=0){
			count++;
			rem=num%10;
			sum=sum+rem;
			pro=pro*rem;
			num/=10;
		}
		
			if(sum==pro){
				
				System.out.println(count);
			}

		
	}
}
