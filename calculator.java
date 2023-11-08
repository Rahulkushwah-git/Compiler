import java.util.*;
public class calculator {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second Number: ");
        int b=sc.nextInt();
        System.out.println("Enter the operator: ");
        char ch=sc.next().charAt(0);
       /*  if(ch=='+'){
            System.out.println("The addition of above two number is : ");
            System.out.println(a+b);

        }
        else if(ch=='-'){
            System.out.println("The subtraction of above two number is : ");
            System.out.println(a-b);
        }
        else if(ch=='*'){
            System.out.println("The Multiplication of above two number is : ");
            System.out.println(a*b);
        }
        else if(ch=='/'){
            System.out.println("The Division of above two number is : ");
            System.out.println(a/b);
        }
        else if(ch=='%'){
            System.out.println("The Modulous of above two number is : ");
            System.out.println(a%b);
        }
        else{
             System.out.println("invalid operation");
        } */
       
        switch(ch){
            case '+':System.out.println("The addition of above two number is : ");
            System.out.println(a+b);
            break;
            case '-':System.out.println("The subtraction of above two number is : ");
            System.out.println(a-b);
            break;
            case '*':System.out.println("The Multiplication of above two number is : ");
            System.out.println(a*b);
            break;
            case '/':System.out.println("The Division of above two number is : ");
            System.out.println(a/b);
            break;
            case '%':System.out.println("The Modulous of above two number is : ");
            System.out.println(a%b);
            break;
            default:System.out.println("invalid operator");
        }

    }
}
