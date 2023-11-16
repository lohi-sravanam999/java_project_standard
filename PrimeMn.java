class PrimeMn{
   public static  void main(String[] ar){
         int m=1, n=100;
       for(int i=m; i<=n; i++){
         int fc=0;
        for(int j=1; j<=i; j++){
          if(i%j==0)
             fc++;
            }
       
       if(fc==2)
          System.out.println(i); 
         } 
    }
  }