import java.util.*;

public class practice {
//bubble sort implementation
    public static void BubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void OptimizeBubbleSort(int arr[]){
        boolean sorted;
        for(int i=0;i<arr.length;i++){
            sorted=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    sorted=true;
                }
            }
            if(!sorted)break;
        }
    }

    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }

    public static void InsertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && curr<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }


    public static void Countinsort(int arr[]){
        int largets=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largets=Math.max(largets,arr[i]);
        }
        int[] count=new int[largets+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                    j++;
                    count[i]--;
            }
        }
    }

    public static void SpiralprintofArray(int spr[][]){
        int startRow=0;
        int startColumn=0;
        int endRow=spr.length-1;
        int endColumn=spr[0].length-1;
        while(startRow <= endRow && startColumn <= endColumn ){
            for(int i=startColumn;i<=endColumn;i++){
                System.out.print(spr[startRow][i]+"  ");
            }
            for(int j=startRow + 1;j<=endRow;j++){
                if(startRow==endRow){
                    break;
                }
                System.out.print(spr[j][endColumn]+"  ");
            }
            for(int i=endColumn-1;i>=startColumn;i--){
                if(startColumn==endColumn){
                    break;
                }
                System.out.print(spr[endRow][i]+"  ");
            }
            for(int j=endRow-1;j>=startRow+1;j--){
                System.out.print(spr[j][startColumn]+"  ");
            }
            startRow++;
            startColumn++;
            endColumn--;
            endRow--;
        }
        System.out.println();
       
    }

    
    public static void main(String[] args){
    //     Scanner sc =new Scanner(System.in);
    //     int[] arr={1,7,3,2,8,4,9,6,};
    //    // Countinsort(arr);
    //     System.out.println("Bubble sort: ");
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     Arrays.sort(arr);
    //     System.out.println();
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    
        int[][] spr={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        SpiralprintofArray(spr);

        
    }
}
