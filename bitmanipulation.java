import java.util.*;


public class bitmanipulation {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'g':System.out.println("Enter the number  to get");
            int n=sc.nextInt();
            System.out.println("Enter position ");
            int pos=sc.nextInt();
            int bitmask = 1<<pos;
            if((bitmask & n)==0){
                System.out.println("Bit was zero");
            }
             else{
                System.out.println("bit was one");
            }
            break;

            case 's': System.out.println("Enter the number for set : ");
             n=sc.nextInt();
             System.out.println("Enter position ");
             pos=sc.nextInt();
             bitmask=1<<pos;
             int newnumber=(bitmask | n);
             System.out.println(newnumber);
             
            break;

            case 'c':System.out.println("Enter the number for clear : ");
             n=sc.nextInt();
             System.out.println("Enter position ");
             pos=sc.nextInt();
             bitmask=1<<pos;
             int notBitmask=~(bitmask);
             newnumber=(notBitmask & n);
             System.out.println(newnumber);

            break;

            case 'u':System.out.println("Enter '0' to update number by zero or '1' to update number by one ");
             int check=sc.nextInt();
             System.out.println("Enter the number  for update : ");
             n=sc.nextInt();
             System.out.println("Enter position ");
             pos=sc.nextInt();
             bitmask=1<<pos;
             if(check==0){
                notBitmask=~(bitmask);
                newnumber=(notBitmask & n);
                System.out.println(newnumber);
             }
             else{
                newnumber=(bitmask | n);
                System.out.println(newnumber);               
             }
            
             
            break;
            
            default:{
                System.out.println("BitManipulation need instruction");
            }

        }

        
    }
    
}
