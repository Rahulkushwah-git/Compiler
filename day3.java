import java.util.*;
public class day3 {
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Que no First : ");
        int que_no=sc.nextInt();

        switch (que_no) {
            case 1 :System.out.println("Enter the number to check : ");
                    int Num=sc.nextInt();
                    if(Num>0){
                        System.out.println("Number is Positive");
                    }else{
                        System.out.println("Number is Negative");
                    }
                
                break;
            case 2  :System.out.println("Enter the temperaturs: ");
                    double temp=sc.nextDouble();
                    if(temp>100){
                        System.out.println("You are having fever");
                    }else{
                        System.out.println("You are all good");
                    }
                break;
            case 3  :System.out.println("Enter the no. of day");
                     int day=sc.nextInt();
                     switch(day){
                        case 1:System.out.println("Monday");
                            break;
                        case 2:System.out.println("Tuesday");
                            break;
                        case 3:System.out.println("Wednesday");
                            break;
                        case 4:System.out.println("Thursday");
                            break;
                        case 5:System.out.println("Friday");
                            break;
                        case 6:System.out.println("Saturday");
                            break;
                        case 7:System.out.println("Sunday");
                            break;
                        default:System.out.println("Invalid day Number!");
                            break;
                     }
                break;     
            case 4  :System.out.println("Enter the Year : ");
                     int year=sc.nextInt();
                     if(year%4==0 && (year%400==0 || year%100!=0)){
                        System.out.println("The Year entered is leap  year: ");
                     }else{
                        System.out.println("Entered year is not Leap Year !");
                     }
                break;
            default:System.out.print("You have entered the wrong Question Number:!");
                break;
        }

    }
}
