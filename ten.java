import java.util.*;

public class ten {
    /*
     * take 3 number & print their average using function 
     *
    public static int AverageFun(int a, int b, int c){
        int avg=(a+b+c)/3;
        return avg;

    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=AverageFun( a, b,  c);
        System.out.println(avg);
        


    } */
    
    /*
     * sum of odd number 
     *
    public static float sumOdd(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            if(i % 2 !=0){
                sum+=i;
            }
        } 
        return sum;
    }
    
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        float sum= sumOdd(n);
        System.out.println(sum);
        
    } */



/*
 * function to predict gratest number out of given two number
 *
    public static int greatestNum(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }

    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //int c=sc.nextInt();
        System.out.println(greatestNum(a, b));

    } */

    /*
     * calculate circumfrernce of circle
     *
    public static float cicumFerence(float r, float p){
        
        float circum= 2*p*r;
        return circum;

    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();
        float p=22/7;
        float circum=cicumFerence(r, p);
        System.out.println(circum);

    } */

    /*
     * 
     * function to check eligible voters age
     *
    public static boolean elgibleVoter(int a){
        if(a>=18){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        boolean s=elgibleVoter(a);
        if(s==true){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("not Eligible to Vote");
        }
        
        
    } */
/*
 *positive negative zero count  
 *
    public static void countNPZ(int a,int n){
        int neg=0;
        int pos=0;
        int zero=0;
        for(int i=1;i<=n;i++){
            if(a<0){
            
            neg+=1;
            
        }
        else if(a>0){
            
            pos+=1;
            
        }else{
            
            zero+=1;
           
        }
        }
        

        System.out.println("the count of negitive number  you have entered is"+ neg);
        System.out.println("the count of positive number  you have entered is"+ pos);
        System.out.println("the number of Zeros you have entered is"+ zero);
        
    }
    public static void main(String aarg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            countNPZ(a,n);
        }
        
       
    }*/

/*
 * power to the
 *
    public static int powerTo(int x,int n){
        int power=1;
        for(int i=1;i<=n;i++){
            power*=x;
        }
        
        return power;
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int power=powerTo(x, n);
        System.out.println(power);
    } */

    /*
     * greatest common factor
     *

     public static void greatestCommonDivisor(int a,int b){
        int expo=0;
        for(int i=1;i<=a*b;i++){
            if(a % i==0 && b % i==0){
                  expo=i;
                  System.out.println(expo);
            }
            
        }
        
     }
     public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        greatestCommonDivisor(a, b);
        //System.out.println(expo);

     } */

/*
 * fibonacci Series 
 *
     public static void fibonacciSerie(int a,int b,int n){
        int series=0;
       
        for(int i=1;i<=n;i++){
            
            series=a+b;
            a=b;
            b=series;
            //System.out.print(","+b);
            System.out.print(" "+b);
        }
        

     }

     public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first starting number: ");
        int a=sc.nextInt();
        System.out.println("Enter the Second starting number: ");
        int b=sc.nextInt();
        System.out.println("Enter the  count upto which you want to print: ");
        int n=sc.nextInt();
        fibonacciSerie(a, b, n);
        
     } */



}
