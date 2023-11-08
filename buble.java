import java.util.*;

public class buble {

    public static void printArray(int arr[]){
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
        for(int i=0;i<n;i++){
            System.out.println(arr[i]); 
        }

        //buble sorting 
        for(int i=0;i< arr.length- 1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                //swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        printArray(arr);

    }
    
}
