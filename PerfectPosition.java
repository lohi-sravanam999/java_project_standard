class PerfectPosition{
      public static void main(String[] args){
       int n=1, c=0,i=1;
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
             int sum=0;
     for(int i=1; i<=n/2;i++){
       if(n%i==0){
          sum=sum+i;
        }
        } 
         return sum==n;
      
   }

  }