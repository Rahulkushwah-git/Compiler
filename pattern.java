import java.util.*;
public class pattern {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the cradentiall of rectangle/square: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        /* 
        Square pattern
        for(int i=1;i<=a;i++){
            System.out.println(" ");
            for(int j=1;j<=a;j++){
                System.out.print("*");
            }
        }*/
        
        /* 
        rectangle pattern 
        for(int i=1;i<=a;i++){
            System.out.println(" ");
            for(int j=1;j<=b;j++){
                System.out.print("*");
            }
        }*/

        /* hollow rectangle /square 


        for(int i=1;i<=a;i++){
            System.out.println("");
            for(int j=1;j<=b;j++){
                
                    if(i==1 || j==1  || i==a ||j==b){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
            }
            
        }*/

        /* half triangle *
        for(int i=1;i<=a;i++ ){
            System.out.println(" ");
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }*/

        /* inverted half triangle   *
        for(int i=a;i>=1;i-- ){
            System.out.println(" ");
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }*/
        
    }
}
