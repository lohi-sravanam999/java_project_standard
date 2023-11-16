class Palindrome 
{
	public static void main(String[] args) 
	{
		int num=724,rev=0,rem;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(num==427){
		System.out.println(rev+"is a palindrome");
		}
		else{
		System.out.println(rev+"is not a palindrome");
		}
	}
}
