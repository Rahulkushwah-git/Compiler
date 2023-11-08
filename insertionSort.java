import java.util.*;

public class insertionSort {
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
        System.out.println("Given Array: ");
        for(int i=0;i<n;i++){
            
            System.out.print("  "+arr[i]); 
        }
/* /
        for(int i=0;i<arr.length-1;i++){
            int pivot=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[pivot]>arr[j]){
                    pivot=j;
                }
                int temp=arr[j];
                arr[j]=arr[pivot];
                arr[j]=temp;
            }

        }*/
        for(int i=1;i<arr.length;i++){
            int pivot =arr[i];
            int j=i-1;
            while(j>=0 && pivot<arr[j]){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=pivot;

        }
        printArray(arr);

    }
    
}
