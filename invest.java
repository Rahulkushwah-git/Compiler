import java.util.Scanner;
import java.util.*;

public class invest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial amount you want to trade : ");
        float initial_amt=sc.nextFloat();
        System.out.println("Enter the % change : ");
        float rate_chng=sc.nextFloat();
        System.out.println("Enter the daily addon amount: ");
        int addon_amn=sc.nextInt();
        System.out.println("Enter the no.of days : ");
        int days=sc.nextInt();
        
        float margin=0;

        for(int i=1;i<=days;i++){
            margin=((initial_amt * 70/100)+addon_amn) * 5 ;
            float brok=20+4*(margin * 352/1000000);
            float profit=(margin*rate_chng/100)-brok;
            float outcome=initial_amt+profit;
            initial_amt=outcome;
            System.out.print("invested: "+margin+"\t");
            System.out.print("\t"+"profit: "+profit+"\t");
            System.out.println("\t"+"total_after: "+outcome);

            
        }

    }

}
