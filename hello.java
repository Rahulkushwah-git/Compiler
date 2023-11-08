import java.util.*;

public class hello{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the Name: ");
        String name=sc.nextLine();
        System.out.println("Enter value of a: ");
        int a=sc.nextInt();
        System.out.println("enter the value of b: ");
        float b=sc.nextFloat();
        System.out.println("enter the value of c: ");
        double c=sc.nextDouble();
        System.out.println(name);
        System.out.println(a*b);
        System.out.println(c);

    } 

}