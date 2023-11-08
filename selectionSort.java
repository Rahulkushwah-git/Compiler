import java.util.*;

public class selectionSort {
    public static void printArray(int arr[]){
        System.out.println("\n sorted Array: ");
        for(int i=0;i<arr.length;i++){
            
            System.out.print("  "+arr[i]);
        }
    } 
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n=sc.nextInt();

        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //the above entered Array is 
        System.out.println("The given Array is: ");
        for(int i=0;i<n;i++){
            System.out.print("  "+arr[i]); 
        }
        //System.out.println("");
// Selection sort
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
                int temp=arr[small];
                    arr[small]=arr[i];
                    arr[i]=temp;

            }
            

        }
        printArray(arr);


    }
    
}
