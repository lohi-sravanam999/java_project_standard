class Armstrong
{
	public static void main(String[] args) 
	{
		int num=153,count=0,pro=1,sum=0,num=temp,rem;
		while(num!=0){
			count++;
			num/=10;
		}
		while(num!=0){
			rem=num%10;
			for(int i=1;i<=count;i++){
				pro=pro*rem;
			}
			sum=sum+pro;
			num/=10;
		}
		if(temp==sum){

		System.out.println("is an armstrong");
		}
		else{
			System.out.println("is not an armstrong");
		}
	

	}
}
