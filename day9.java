import java.util.*;

public class day9 {

    public static int TwoDarray(int m, int n){
        Scanner sc= new Scanner(System.in);
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter "+i+j+": ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("arraY: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"  ");
                
            }
            System.out.println();
        }
        return arr[m][n];
    }



    public static void AdditionofTwoArray(int arr[][], int arr1[][], int a,int b){
        int[][] sum=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                sum[i][j]=arr[i][j] +arr1[i][j];
            }
        }
        System.out.println("Sum: ");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(sum[i][j]+"  ");
            }
            System.out.println();
        }
    }


    public static void SubtractionofTwoArray(int arr[][], int arr1[][], int a,int b){
        int[][] subtraction=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                subtraction[i][j]=arr[i][j] - arr1[i][j];
            }
        }
        System.out.println("Sum: ");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(subtraction[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void DivisionofTwoArray(int arr[][], int arr1[][], int a,int b){
        int[][] Division=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                Division[i][j]=arr[i][j] +arr1[i][j];
            }
        }
        System.out.println("Sum: ");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(Division[i][j]+"  ");
            }
            System.out.println();
        }
    }


    public static void MultiplicationofTwoArray(int arr[][], int arr1[][], int a,int b){
        int[][] multiplied=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                multiplied[i][j]=arr[i][j] +arr1[i][j];
            }
        }
        System.out.println("Sum: ");
        for(int i=0;i<a;i++){
            int start=i;
            for(int j=0;j<b;j++){
                int end=j;
                for(int k=0;k<b;k++){

                }

            }
            System.out.println();
        }
    }


    public static void SpiralMatrixPrint(int arr2[][]){
        int startRow=0;
        int sartColumn=0;
        int endRow=arr2.length-1;
        int endColumn=arr2[0].length-1;
        while(startRow<=endRow && sartColumn<=endColumn){
            for(int j=sartColumn;j<=endColumn;j++){
                System.out.print(arr2[startRow][j]+"  ");
            }

            for(int i=startRow+1;i<=endRow;i++){
                if(startRow == endRow){
                    break;
                }
                System.out.print(arr2[i][endColumn]+" ");
            }
            for(int j=endColumn-1;j>=sartColumn;j--){
                if(sartColumn == endColumn){
                    break;
                }
                System.out.print(arr2[endRow][j]+"  ");
            }

            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(arr2[i][sartColumn]+"  ");
            }
            startRow++;
            sartColumn++;
            endColumn--;
            endRow--;
        }
        System.out.println();
    }

    public static boolean TocheckPalidromeString(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the question number : ");
        int que_no=sc.nextInt();
        switch(que_no){
            case 1:System.out.println("Enter the m :");
                   int m=sc.nextInt();
                   System.out.println("enter the n : ");
                   int n=sc.nextInt();
                   TwoDarray(m, n);
                break;
            case 2:System.out.println("Enter the a ");
                    int a=sc.nextInt();
                    System.out.println("Enter the b ");
                    int b=sc.nextInt();
                    
                    int[][] arr=new int[a][b];
                    for(int i=0;i<a;i++){
                        for(int j=0;j<b;j++){
                            System.out.print("Enter "+i+j+": ");
                            arr[i][j]=sc.nextInt();
                        }
                    }
                    int[][] arr1=new int[a][b];
                    for(int i=0;i<a;i++){
                        for(int j=0;j<b;j++){
                            System.out.print("Enter "+i+j+": ");
                            arr1[i][j]=sc.nextInt();
                        }
                    }
                    System.out.println();
                    System.out.println("Enter the operation you want to perform : ");
                    System.out.println();
                    char ch=sc.next().charAt(0);
                    switch(ch){
                        case '+' :AdditionofTwoArray(arr, arr1, a, b); 
                            break;
                        case '*' :MultiplicationofTwoArray(arr, arr1, a, b);
                            break;
                        case '/' :DivisionofTwoArray(arr, arr1, a, b);
                            break;
                        case '-' :SubtractionofTwoArray(arr, arr1, a, b);
                            break;
                        default:
                            break;
                    }
                    System.out.println("ARRAY 1: ");
                    for(int i=0;i<a;i++){
                        for(int j=0;j<b;j++){
                            System.out.print(arr[i][j]+"  ");
                        }
                        System.out.println();
                    }
                    System.out.println("ARRAY 2: ");
                    for(int i=0;i<a;i++){
                        for(int j=0;j<b;j++){
                            System.out.print(arr1[i][j]+"  ");
                        }
                        System.out.println();
                    }                    
                break;
            case 3:System.out.println("spiral Print : ");
                   int[][] arr2={{1,2,3,4},
                                 {5,6,7,8},
                                 {9,10,11,12},
                                 {13,14,15,16}};
                                 SpiralMatrixPrint(arr2);
                break;
            case 4:System.out.println("Chec the String whether it is Plaindrome ! :");
                   String str="Rahul";
                   TocheckPalidromeString(str);                   
                break;
            
            case 5:System.out.println("");

            default:
                break;
        }
    }
    
}
