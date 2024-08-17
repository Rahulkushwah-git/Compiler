
import java.util.*;
public class day5 {
    public static int  product(int a,int b){
           int product =a*b;
           return product;        
    } 


    public static int factorial(int number){
        int fact=1;
        if(number==1 && number==0){
            fact=1;
        }else{
            while(number>1){
                fact*=number;
                number-=1;
            }
        }
        return fact;
    }

    public static double Binomialcoefficent(double n, double r){
        double binomial=1;
        if(n==1 || n==0 && r==1 || r==0){
            binomial=1;
        }
        else{
            double fact_n=1;
            double fact_r=1;
            double factn_r=1;
            double b=n-r;
            while(n>1){
                
                
                if(b>1){
                    factn_r*=b;
                    b--;
                }
                fact_n*=n;
                n--;
                if(r>1){
                    fact_r*=r;
                    r--;
                }
                
            }
            System.out.println("n:"+fact_n+"   r:"+fact_r+"     n-r: "+factn_r);
            binomial=fact_n/(fact_r * factn_r);
        }
        return binomial;
    }

    public static void primenumber(int num) { 
        for(int i = 1; i <= num; i++) {
            boolean isPrime = true;
            if(i == 1) {
                // 1 is not a prime number
                continue;
            } else if(i == 2) {
                System.out.print(i + " ");
            } else {
                for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the que no:");
        int queno=sc.nextInt();
        switch(queno){
            case 1 :System.out.println("entr the number :");
                    int num=sc.nextInt();
                    for(int i=0;i<num;i++){
                        for(int j=i;j<num;j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                break;
            case 2:System.out.println("entr the number :");
                    num=sc.nextInt();
                   for(int i=0;i<num;i++){
                       for(int j=i;j<num;j++){
                          System.out.print( j);
                        }
                       System.out.println();
                    }
                break;
            case 3:System.out.println("Enter the numberr: ");
                   num=sc.nextInt();
                   for(int i=0;i<=num;i++){
                    for(int j=0;j<=i;j++){
                       System.out.print(" * ");
                      }
                      System.out.println();
                  }
                   for(int i=0;i<=num;i++){
                      for(int j=i;j<=num;j++){
                         System.out.print(" * ");
                        }
                        System.out.println();
                    }
                break;
            case 4:System.out.println("Enter the numberr: ");
                   num=sc.nextInt();
                   for(int i=num;i>=0;i--){
                      for(int j=num;j>=i;j--){
                         System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    for(int i=num;i>=0;i--){
                        for(int j=num;j>=i;j--){
                           System.out.print(" * ");
                        }
                        System.out.println();
                    }
                break;
            case 5:System.out.println("Enter the number: "); 
                   num=sc.nextInt();
                   for(int i=0;i<=num;i++){
                    for(int j=i;j<=num;j++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                   }
                break;
            case 6:System.out.println("Enter the number: "); 
                   num=sc.nextInt();
                    for(int i=0;i<=num;i++){
                     for(int j=i;j<=num;j++){
                        System.out.println(" * ");
                     }
                     System.out.println();
                    }
                break;
            case 7:System.out.println("Enter the number: ");
                   int a=sc.nextInt();
                   System.out.println("Enter the umber: ");
                   int b=sc.nextInt();
                   int prod=product(a, b);
                   System.out.println("Product of two number: "+prod);
                break;
            case 8:System.out.println("Enter tge number whose factorial : ");
                   int number=sc.nextInt();
                   int factorial=factorial(number);
                   System.out.println(factorial);
                break;
            case 9:System.out.println("Enter the n for Binomial coefficient:");
                   double n=sc.nextDouble();
                   System.out.println("Enter the r for Binomial coefficient");
                   double r=sc.nextDouble();
                   double binomial=Binomialcoefficent( n,r);
                   System.out.println("binomial: "+binomial);
                break;
            case 10:System.out.println("Enter the number upto which a  prime no: ");
                    num=sc.nextInt();
                    primenumber(num); 
                    
                break;
            default:System.out.println();
                break;

        }
        
    }
    
}
