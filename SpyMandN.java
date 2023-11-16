class SpyMandN 
{
	public static void main(String[] args) 
	{
		int m=1,n=200,pro=1,sum=0,rem;
		for(int i=m;i<=n;i++){
			while(i!=0){
			rem=i%10;
			sum=sum+rem;
			pro=pro*rem;
			i/=10;
		}
		if(sum==pro){
		
		System.out.println("it is a spy number"+sum);
		}
		else{
		System.out.println();
		}
		}

		
		
	}
}