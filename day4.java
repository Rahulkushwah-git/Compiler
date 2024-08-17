import java.util.*;
import java.math.*;
public class day4 {
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.println("Entet the Que no.: ");
        int que_no=sc.nextInt();
        switch(que_no){
            case 1 :System.out.println("Enter the number: ");
                    int n=sc.nextInt();
                    int add=0;
                    while(n<=5){
                        System.out.println(n);
                        add+=n;
                        n++;
                    };
                    do{
                        System.out.println(n +" ,"+ add);
                        add-=n;
                        n--;
                    }while(n>=0);
                break;
            case 2  :System.out.println("Enter the Length & breadth:");
                     int leng=sc.nextInt();
                     int bre=sc.nextInt();
                     for(int i=0;i<leng;i++){
                        for(int j=0;j<bre;j++){
                            // if(i==0 || j==0){
                            //     System.err.print(" * ");
                            // }else if(i==leng-1 || j==bre-1){
                            //     System.out.print(" * ");
                            // }else{
                            //     System.err.print("   ");
                            // }
                            if((i==0 || j==0)||(i==leng-1 || j==bre-1)){
                                System.out.print(" * ");
                            }else{
                                System.out.print("   ");
                            }
                        }
                        System.out.println();
                     }
                break;
            case  3 :System.out.println("Enter the number : ");
                     int revrse=sc.nextInt();
                     int out=0;
                     do{
                        out=(out*10)+revrse%10;
                        revrse/=10;
                     }while(revrse!=0);
                     System.out.println("reverse of given Number is: "+out);
                break;
            case  4 :System.out.println("Entert the number : ");
                     
                     do{
                        int no=sc.nextInt();
                        System.out.println(no);
                        if(no%10==0){
                            break;
                        }
                     }
                     while(true);
                     
                break;
            case  5 :System.out.println("Enter the number: ");
                     do{
                        int no=sc.nextInt();
                        if(no%10==0){
                            continue;
                        }
                        System.out.println(no);
                     }
                     while(true);
                     
                //break;
                

            case  6 :System.out.println("enter the number OF INPUTS YOU WANT TO GIVE : ");
                     int seq=sc.nextInt();
                     
                     int odd=0;
                     int i=1;
                     int even =0;
                     while(i<=seq){
                        System.out.println("Enter the number : ");
                        int input=sc.nextInt();
                     
                        if(input%2==0){
                            even+=input;
                        }
                        else{
                            odd+=input;
                           
                        }
                        i++;
                     }
                     
                     System.out.println(odd+"oddsumup" +even+"Even sumup");
                     
                break;

            case 7  :System.out.println("Enter the number whose table you want to print : ");
                     int tab=sc.nextInt();
                     System.out.println("enter the numbet upto which table you want to print : ");
                     int upto=sc.nextInt();
                     i=0;
                     while(i<=upto){
                        System.out.println(tab+" * "+i+" = "+tab*i);
                        i++;

                     }

            case 8  :System.out.println("Enter the number whose factorial need to print :");
                     double fact=sc.nextDouble();
                     double j=0;
                     j=fact;
                     double factorial=1;
                     while(j>=1){
                        if(fact==0 & fact==1){
                            factorial=1;
                        }else{
                            factorial*=j;
                            j--;
                        }

                     }  
                     System.out.println("Factorial: "+factorial);       
            default:System.out.println();
                break;    
        }
    }
}
