import java.util.*;

public class month {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int ch= sc.nextInt();
        System.out.println("Enter the number of month: ");
        switch(ch){
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("february");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("may");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("August");
            break;
            case 9: System.out.println("September");
            break;
            case 10: System.out.println("October");
            break;
            case 11: System.out.println("november");
            break;
            case 12: System.out.println("December");
            break;
            default: System.out.println("Invalid month number");
            
        }
    }
}
