import java.util.*;

public class Arrays {

     public static void searchArray(int ar[],int s,int n){
        for(int i=0;i<n;i++){
            if(ar[i]==s){
                System.out.println(i);
            }
            
            
        }

    }
    
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1,2: ");
        int ch=sc.nextInt();
        switch(ch){
            case 1:System.out.println("Enter the length of array: ");
            int n =sc.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter the element of array :");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                System.out.println("Element at index "+i +":  " + arr[i]);
            }

            break;
            case 2:System.out.println("Enter the length of array: ");
             n=sc.nextInt();
            int ar[]=new int[n];
            System.out.println("Enter the element of array: ");
            for(int i=0;i<n;i++){
                ar[i]=sc.nextInt();
            }
            System.out.println("enter the number you want to search in array : ");
            int s=sc.nextInt();
            int temp;
            searchArray(ar, s, n);

            break;
            default:System.out.println("Andhe !");

        }
        
    }
   


}
    
        
        
    
    

