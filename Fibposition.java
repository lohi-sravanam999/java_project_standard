class FibPosition{
     public static void main(String[] args){
       int n=11;
       int a=0,b=1, sum=0;
           for(int i=2; i<n;i++){
            sum=a+b;
             a=b;
             b=sum;   
      }
          System.out.println(a);
  }
}