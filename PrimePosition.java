class PrimePosition{
      public static void main(String[] args){
       int n=100, c=0,i=1;
        while(true){
        if(perfect(i)){
          c++;
       }
       if(c==n){
     break;
     }
      i++;
     }
        System.out.println(i);
    }
     public static boolean perfect(int n){
             int fc=0;
     for(int i=1; i<=n;i++){
       if(n%i==0){
          fc++;
        }
      } 
         return fc==2;
      
   }

  }