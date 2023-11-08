import java.util.*;
public class ifelse {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entern your number please : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("equal number");
        }
        else if(a>b){
            System.out.println("A is greater number");
        }
        else{
            System.out.println("B is greater number");
        }

    }
}
