class Strong 
{
	public static void main(String[] args) 
	{
		int num=145,fact=1,rem,sum=0,temp=num;
		while(num!=0){
			rem=num%10;
			for(int i=1;i<=num;i++){
			fact=fact*i;
			}
		
			sum=sum+fact;
			num/=10;
			
		}
		if(sum==temp){
		System.out.println("strong number"+sum);
		}
		else{
			System.out.println("not a strong number"+sum);
		}
	}
}
