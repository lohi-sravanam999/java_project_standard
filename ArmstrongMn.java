class ArmstrongMn{
       public static void main(String[] args){
           int n=153, temp=n;
           int sum=0,c=0;
           while(n!=0){
             c++;
           n=n/10;
           }
          n=temp;
           while(n!=0){
           int r=n%10;
           int p=1;
              for(int j=1; j<=c; j++){
                 p=p*r;
              }
           sum=sum+p;
           n=n/10;
           }
           if(temp==sum){
           System.out.println("armstrong num");
           }
          else{
              System.out.println(" not a armstrong num");
           }
        
      }
