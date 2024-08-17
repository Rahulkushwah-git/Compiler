import java.util.*;
//import java.util.Arrays;

public class day8 {

    public static void bubbleShort(int arr[]){
        boolean swap;
        for(int i=0;i<arr.length-1;i++){
            swap=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if(!swap) break;
        }
    }

    public static void selectionSort(int arr1[]){
       
        for(int i=0;i<arr1.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[smallest]>arr1[j]){
                    smallest=j;
                }
            }
            int temp=arr1[smallest];
            arr1[smallest]=arr1[i];
            arr1[i]=temp;
        }
    }

    public static void insertionSort(int arr2[]){
        for(int i=1;i<arr2.length;i++){
            int curr=arr2[i];
            int prev=i-1;
            while(prev>=0 && arr2[prev] > curr){
                arr2[prev + 1] = arr2[prev];
                prev--;
            }
            arr2[prev + 1] = curr;
        }
    }

    public static void Countingsort(int arr4[]){
        int largets=Integer.MIN_VALUE;
        for(int i=0;i<arr4.length;i++){
            largets=Math.max(largets,arr4[i]);
        }
        int[] count=new int[largets+1];
        for(int i=0;i<arr4.length;i++){
            count[arr4[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length; i++){
            while(count[i]>0){
                arr4[j]=i;
                j++;
                count[i]--;
            }
            
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Question: ");
        int que_no=sc.nextInt();
       switch(que_no){
        case 1:System.out.println();
               int[] arr={8,5,1,9,3,7,4};
               bubbleShort(arr);
               System.out.println("The sorted Array : ");
               for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
               }System.out.println();
            break;
        case 2:System.out.println("Selection Sorting ! :  ");
            int[] arr1={5,4,1,3,2};
               selectionSort(arr1);
               for(int i=0;i<arr1.length;i++){
                System.out.print(arr1[i]+"  ");
               }
            break;
        case 3:System.out.println("Insertion sort : ");
               int[] arr2={7,1,6,3,2,4};
               insertionSort(arr2);
               for(int i=0;i<arr2.length;i++){
                System.out.print(arr2[i]+" ");
               }
            break;
        case 4:System.out.println("Inbuilt sort :");
               int[] arr3={8,2,6,1,9,3,7};
               Arrays.sort(arr3);
               for(int i=0;i<arr3.length;i++){
                System.out.print(arr3[i]+" ");
               }
            break;
        case 5:System.out.println("Counting sort : ");
               int[] arr4={1,5,3,6,2,4,7,2,3,5,1,6,3,1,2,5,6,7};
               Countingsort(arr4);
               for(int i=0;i<arr4.length;i++){
                System.out.print(arr4[i]+" ");
               }
            break;
        default:
            break;
       }
    }
}
