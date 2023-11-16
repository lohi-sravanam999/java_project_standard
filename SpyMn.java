class SpyMn{
    public static void main(String[] args){
     for(int i=10; i<=500; i++){
      int n=i;
     int sum=0, pro=1;
       while(n!=0){
        int r=n%10;
         sum=sum+r;
         pro=pro*r;
        n=n/10;
     }
   if(sum==pro){
        System.out.println(i);
     }
    }
   }
}