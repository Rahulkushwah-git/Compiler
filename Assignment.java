import java.util.*;


public class Assignment{
        public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the assignment q no. : ");
        int ch=sc.nextInt();

        switch(ch){
            case 1:System.out.println("Enter how many entry you want to made : ");
            int n=sc.nextInt();
            String arr[]=new String[n];
            System.out.println("Enter the names: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLine();
            }

            //print the arrays of names 

            for(int i=0;i<n;i++){
                System.out.print("  "+ arr[i]);
            }
            break;

            case 2:System.out.println("Enter the length of array: ");
            n=sc.nextInt();
            int ar[]=new int[n];
            System.out.println("Enter the inputs of array:");
            for(int i=0;i<n;i++){
                ar[i]=sc.nextInt();
            }
            System.out.println("The given array : ");
            for(int i=0;i<n;i++){
                System.out.print("  "+ar[i]);
            }
            //now we need to search for minimum & maximum
            int i=0;
            int max=ar[i];
            int min=ar[i];
            for( i=1;i<n;i++ ){             
                if(ar[i]>max ){
                    max=ar[i];
                    
                } 
                else if(ar[i]<min){
                    min=ar[i];
                }
            }
            System.out.println("\n maximum number: "+ max  +"\tminimum number: "+ min);
            break;

            case 3:System.out.println("Enter the length of Array: ");
            n=sc.nextInt();
            int art[]=new int[n];
            System.out.println("Enter the elemnt : ");
            for( i=0;i<n;i++){
                art[i]=sc.nextInt();
            }
            //given Arrray
            System.out.println("Given aarray: ");
            for(i=0;i<n;i++){
                System.out.print("  "+art[i]);
            }
            int count=0;
            //lets check Array is sortedor not 
            for(i=0;i<art.length;i++){
                int init=art[i];
                
                for(int j=i+1;j<art.length;j++){
                    if(art[j]<init){
                        count=1;
                    }

                }
                
            }
            if(count==0){
                    System.out.println("\nsorted");
                }
                else{
                    System.out.println("\nNot sorted");
                }
            break;


            default: {
                System.out.println(" jai hoooo!");
            }


        }
       
    }

}