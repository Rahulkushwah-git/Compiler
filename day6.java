
import java.util.*;
public class day6 {


    public static int binaryTodecimal(int binnum){
        int count=1;

        int decimalnum=0;
        while(binnum>0){
            int mul=binnum%10;
            binnum=binnum/10;
            decimalnum+=mul*count;
            count=count*2;
        }
        return decimalnum;
    }

    public static int DecimaltoBinary(int decimalnum){
        int binary=0;
        int pow=0;
        while(decimalnum>0){
            int remainder=decimalnum%2;
            binary=binary +(remainder*(int)Math.pow(10,pow));
            pow++;
            decimalnum=decimalnum/2;
        }
        return binary;
    }

    public static int avergaeofThree(int a, int b, int c){
        int average=0;
        average=(a+b+c)/3;
        return average;

    }

    public static boolean isEven(int random){
        boolean isEven=true;
        if(random%2==0){
            isEven=true;
        }else{
            isEven=false;
        }
        return isEven;
    }

    public static int  CheckPalindrome(int palindrome){
        int reverse=0;
        while(palindrome>0){
            int lastdigit=palindrome%10;
            reverse=reverse * 10 + lastdigit;
            palindrome/=10;
        }
        return reverse;
    }

    public static int SumofDigits(int num){
        int sum=0;

        while(num>0){
            //int digit=num%10;
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public static void holllowRectangle(int m, int n ){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==m || j==1 || j==n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }


    public static void triangle(int tri){
        for(int i=1;i<=tri;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=1;i<=tri;i++){
            for(int j=i;j<=tri;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=tri;i>=1;i--){
            for(int j=tri;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=tri;i>=1;i--){
            char ch='A';
            for(int j=tri;j>=i;j--){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        System.out.println();
        
        int a=1;
        for(int i=tri;i>=1;i--){
            for(int j=tri;j>=i;j--){
                System.out.print(a+" ");
            }
            a++;
            System.out.println("  ");
        }

        System.out.println();
        int b=1;
        for(int i=tri;i>=1;i--){
            for(int j=tri;j>=i;j--){
                System.out.print(b+" ");
                b++;
            }
            System.out.println("  ");
        }

        System.out.println();

        for(int i=tri;i>=1;i--){
            for(int j=tri;j>=i;j--){
                if((i+j)%2==0){
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println("  ");
        }
        
    }

    public static void butterflyPattern(int butt){
        for(int i=1;i<=butt;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<=2*(butt-i);j++){
                System.out.print("   ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=butt;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<=2*(butt-i);j++){
                System.out.print("   ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void mypattern(int p){
        for(int i=p;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<=2*(p-i);j++){
                System.err.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=1;i<=p;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<=2*(p-i);j++){
                System.err.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void solidrhombus(int r){
        for(int i=1;i<=r;i++){
            for(int j=i;j<r;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=r;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<i;j++){
                System.out.print("   ");
            }
            System.out.println();
        }

        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r-i);j++){
                System.out.print("   ");
            }
            for(int j=1;j<=r;j++){
                System.out.print(" * ");
            }
            // for(int j=1;j<=;j--){
            //     System.out.print("   ");
            // }
            System.out.println();
        }


    }
    public static void hollowrhombus(int h){
        for(int i=1;i<=h;i++){
            for(int j=i;j<h;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=h;j++){
                if(i==1|| i==h || j==1 || j==h){
                    System.out.print(" * ");
                }else{
                    System.err.print("   ");
                }
            }
            for(int j=1;j<i;j++){
                System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void diamond(int d){
        for(int i=1;i<=d;i++){
            for(int j=1;j<=(d-i);j++){
                System.out.print("   ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=d;i>=1;i--){
            for(int j=1;j<=(d-i);j++){
                System.out.print("   ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Que no: ");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:System.out.println("Enter the binary number in 1010 form: ");
                    int binnum=sc.nextInt();
                    int decimalnum=binaryTodecimal(binnum);
                    System.out.println("Decimal Number: "+decimalnum);
                break;
            case 2:System.out.println("Enter the decimal Number for binary conversion: ");
                    decimalnum=sc.nextInt();
                    int binary=DecimaltoBinary(decimalnum);
                    System.out.println("Decimal to binary of "+decimalnum+" is : "+binary);

                break;
            case 3:System.out.println("Enter the no. 1: ");
                   int a=sc.nextInt();
                   System.out.println("Enter the no. 2: ");
                   int b=sc.nextInt();
                   System.out.println("Enter the no. 3: ");
                   int c=sc.nextInt();
                   int average= avergaeofThree(a,b,c);
                   System.out.println("Average of three number:"+average);

                break;
            case 4:System.out.println("To check Whether number is even: ");
                    boolean even=isEven(21);
                    System.out.println(even);
                break;
            case 5:System.out.println("Enter the number to check : ");
                   int palindrome=sc.nextInt();
                   int ispalindrome=CheckPalindrome(palindrome);
                   if(ispalindrome==palindrome){
                    System.out.println("Palindrome of "+palindrome+" is: "+ispalindrome);
                   }else{
                    System.out.println("Palindrome of "+palindrome+" is not equal to : "+ispalindrome);
                   }
                break;
            case 6:System.out.println("Enter the number : ");
                   int num=sc.nextInt();
                   int sum=SumofDigits(num);
                   System.out.println("Sum of Digits is: "+sum);
                break;
            case 7:System.out.println("enter the number : ");
                   int n=sc.nextInt();
                   System.out.println("enter the number : ");
                   int m=sc.nextInt();
                   holllowRectangle(m, n);
                break;
            case 8:System.out.println("Enter the number : ");
                    int tri=sc.nextInt();
                    triangle(tri);
                break;
            case 9:System.out.println("Enter the number to print pattern : ");
                    int butt=sc.nextInt();
                    butterflyPattern(butt);
                break;
            case 10:System.out.println("Enter number: ");
                    int p=sc.nextInt();
                    mypattern(p);
                break;
            case 11:System.out.println("Enter the number : ");
                    int r=sc.nextInt();
                    solidrhombus(r);
                break;
            case 12:System.out.println("Enter the number: ");
                    int h =sc.nextInt();
                    hollowrhombus(h);
                break;
            default:System.out.println("Enter the Number: ");
                    int d=sc.nextInt();
                    diamond(d);
                    
                break;
        }
    }
    
}
