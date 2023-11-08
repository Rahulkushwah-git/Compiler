import java.util.*;

public class function {
    
    public static void printMyName(String name,String E_mail_id,String profession,int age,int mobile_no){
        System.out.println(name);
        System.out.println(E_mail_id);
        System.out.println(profession);
        System.out.println(age);
        System.out.println(mobile_no);
        
        return;

    }

    //sum of two number  *
    public static int printSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    //product of two number *
    public static float printProduct(int a, int b){
        int product=a*b;
        return product;
        
    }

    //Factorial number  */
    public static void printFactorial(int a){
        int factorial=1;
        for(int i=a;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
            
    }


    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1,2,3,4: ");
        int ch=sc.nextInt();
        switch(ch){
            case 1: System.out.println("Enter the Name please : ");
            String name=sc.nextLine();
            System.out.println("Enter the E mail id: ");
            String E_mail_id=sc.nextLine();
            System.out.println("Enter the Profession: ");
            String profession=sc.nextLine();
            System.out.println("Enter the age: ");
            int age=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the mobile number: ");
            int mobile_no=sc.nextInt();
            printMyName(name,E_mail_id,profession,age,mobile_no);

            break;

            case 2:int a=sc.nextInt();
            int b=sc.nextInt();

            int sum=printSum(a,b);
            System.out.println(sum);
            break;

            case 3:a=sc.nextInt();
            b=sc.nextInt();

            float product=printProduct(a,b);
            System.out.println(product);
            break;

            case 4: a=sc.nextInt();
            printFactorial(a);

            default:System.out.println("Andhe!  ");

        }         

    }

}
