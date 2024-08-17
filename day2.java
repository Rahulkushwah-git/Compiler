import java.util.*;
public class day2 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. A:");
        double num1=sc.nextDouble();
        System.out.print("Enter the no. B:");
        double num2=sc.nextDouble();
        System.out.print("enter the operator: ");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+' :System.out.print("Sum= "+(num1+num2));
                       break;
            case '-' :System.out.print("Subtraction= "+(num1-num2));
                       break;
            case '*' :System.out.print("Multiplication= "+(num1*num2));
                       break;
            case '/' :System.out.print("Division= "+(num1/num2));
                       break;
            case '%' :System.out.print("Modulos= "+(num1%num2));
                       break;
            default :System.out.print("Enter the Income : ");
                    double income=sc.nextDouble();
                    double tax=0;
                   if(income<500000){
                        System.out.println("No Tax on your income Enjoy! : ");
                    }
                   else if(income>500000 && income<1000000){
                        tax+=income*0.1;
                        income=income-tax;
                        System.out.println("Tax will deduct from income :"+tax);
                        System.out.println("Income you will get : "+income);
    
                    }
                    else{
                        tax+=income*0.3;
                        income=income-tax;
                        System.out.println("Tax will deduct from income :"+tax);
                        System.out.println("Income you will get: "+income);
                    }
                      
        }
        
    }
}
