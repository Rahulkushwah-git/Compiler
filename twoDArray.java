import java.util.*;

public class twoDArray{
    
    public static void Search2DArray(int arr[][],int s,int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==s){
                    System.out.print("the index is:  "+ i+"x"+j);

                }
                
            }
        }

    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of row of 2D array: ");
        int r=sc.nextInt();
        System.out.println("Enter the no.of column of 2D array: ");
        int c=sc.nextInt();
        System.out.println("Enter the element : ");

        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //print array
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("   "+ arr[i][j]);
            }
            System.out.println(" ");

        }
        System.out.println("Enter the Number you want to Search in Array : ");
        int s=sc.nextInt();

        Search2DArray(arr, s, r, c);

        
    }

}