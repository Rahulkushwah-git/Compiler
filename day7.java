import java.util.*;

import javax.swing.event.InternalFrameEvent;

public class day7 {
    
    public static int Linearsearch(int lnr[],int ser){
        int i=0;
        boolean linear=true;
        for(i=0;i<=lnr.length;i++){
            if(lnr[i]==ser){
                linear=true;
                return i;
            }else if(lnr[i]!=ser){
                return -1;
            }else{
                System.out.println("error in code : ");
            }
        }
        return i;
    }

    public static int maximumNumber(int mtr[]){
        int maxi=mtr[0];
        for(int i=1;i<mtr.length;i++){
            if(mtr[i]>maxi){
                maxi=mtr[i];
            }
        }
        return maxi;
    }
    public static int letBinary(int bin[],int serc){
        int start=0;
        int end=bin.length-1;
        
        while(start<=0){
            int mid=(end+start)/2;
            if(bin[mid]==serc){
                return mid;
            }else if(bin[mid]>serc){
                end=mid-1;

            }else if(bin[mid]<serc){
                start=mid+1;
            }
        }
        return -1;
    }
    public static void reverseArrqy(int rvrs[]){
        int star=0;
        int end=rvrs.length-1;
        while(star<end){
            int temp=0;
            temp=rvrs[star];
            rvrs[star]=rvrs[end];
            rvrs[end]=temp;
            star+=1;
            end-=1;


        }
        
    }
    public static void printpairs(int pair[]){
        for(int i=0;i<pair.length;i++){
            int current=pair[i];
            for(int j=i+1;j<pair.length;j++){
                System.out.print("("+current+","+pair[j]+") ");
            }
            System.out.println();
        }
        
    }

    public static void printsubArray(int subarray[]){
        int total_subArray=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<subarray.length;i++){
            int start=i;
            for(int j=i;j<subarray.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(subarray[k]+"  ");
                    sum+=subarray[k];
                    if(sum>max){
                        max=sum;
                        if(start==0){
                            min=sum;
                        }
                    }else if(sum<min){
                        min=sum;
                    }

                }
                System.out.print("  Sum: "+sum);
                total_subArray+=1;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Minimum sum of subArray: "+min);
        System.out.println("Maximum sum of SubArray : "+max);
        System.out.println("The total number of Total Sub Array : "+total_subArray);
    }

    public static void prefixprintsubArray(int prefixM[]){
        int total_subArray=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[prefixM.length];

        prefix[0]=prefixM[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1] + prefixM[i];
        }


        for(int i=0;i<prefixM.length;i++){
            int start=i;
            for(int j=i;j<prefixM.length;j++){
                int end=j;
                int currSum=0;
                currSum= start == 0 ? prefix[end]  : prefix[end] - prefix[start-1];
                if(currSum>max){
                    max=currSum;
                }
                
            }
            System.out.println();
        }
    }




    public static void kadaneAlgorithms(int kalgo[]){
        int maxs=Integer.MIN_VALUE;
        int currs=0;

        for(int i=0;i<kalgo.length;i++){
            currs=currs+kalgo[i];
            if(kalgo[i]<0){
                maxs=Math.min(currs,maxs);
            }
            if(currs < 0){
                maxs=Math.max(currs,maxs);
            }
            maxs = Math.max(currs,maxs);
        }
        System.out.println("Our max Subarray sum is : "+ maxs);
         
    }

    public static int TrapppedWater(int height[]){
        int n=height.length;
        int[] leftMax=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int[] rightMax=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;

    }

    public static int unknownThings(int nums[],int target, int find){
        int l1=target;
        int l2=nums.length-target;
        int[] arr1=new int[l1];
        int[] arr2=new int[l2];
        for(int i=0;i<l1;i++){
            arr1[i]=nums[i];
        }
        for(int i=0;i<l2;i++){
            arr2[i]=nums[l1+i];
        }

        for(int j=0;j<l2;j++){
            nums[j]=arr2[j];
        }
        for(int j=0;j<l1;j++){
            nums[j+l2]=arr1[j];
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==find){
                return j;
            }
        }

        return -1;
    }

    public static int buySellStocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit=prices[i]-buyPrice;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  QUE NO. TO check: ");
        int CH = sc.nextInt();
        switch(CH){
            case 1:System.out.println("Enter the length of array : ");
                   int len=sc.nextInt();
                   int []arr=new int[len];
                   for(int i=0;i<len;i++){
                    System.out.print("Enter the no."+i+" :  ");
                    arr[i]=sc.nextInt();
                   }
                   System.out.println();
                   for(int i=0;i<len;i++){
                    System.out.print("Entered array is: "+arr[i]+"  ");
                   }
                break;
            case 2:System.out.println("Enter the length of array ");
                   int lengh=sc.nextInt();
                   sc.nextLine();
                  String []str=new String[lengh];
                  for(int i=0;i<lengh;i++){
                    System.out.print("Enter the"+i+"th String : ");
                    str[i]=sc.nextLine();
                  }
                  System.out.println();

                  for(int i=0;i<lengh;i++){
                    System.out.print("   "+str[i]);
                  }
            case 3:System.out.println("Enter the element to search  : ");
                   int ser=sc.nextInt();
                   sc.nextLine();
                   int lnr[]={12,13,14,15,16,23,34,45,56,67,78,89,90,98,97,87,66,76,65,54,43,32,21,11};
                   int search=Linearsearch(lnr, ser);
                   if(search==-1){
                    System.out.println("Not found : ");
                   }else{
                    System.out.println("The element is present at: "+search);
                   }
                break;
            case 4:System.out.println("Enter the length of array ");
                   lengh=sc.nextInt();
                   sc.nextLine();
                   int []mtr=new int[lengh];
                    for(int i=0;i<lengh;i++){
                    System.out.print("Enter the number "+i+" : ");
                      mtr[i]=sc.nextInt();
                    }
                    int maximum=maximumNumber(mtr);
                    for(int i=0;i<mtr.length;i++){
                        System.out.print(mtr[i]+"  ");
                    }System.out.println();
                    System.out.println("the maximum no. of aabove is : "+maximum);
                break;
            case 5:System.out.println("Enter the sortded array to implement Binary search: ");
                   int[] bin={1,4,6,7,9,11,13,14,17,19,22,24,26,27,68,49,80};
                   System.out.println("Enter the element to search : ");
                   int serc=sc.nextInt();
                   int index=letBinary(bin, serc);
                   if(index==-1){
                    System.out.println("Entered elment does'nt exist in array");
                   }else{
                    System.out.println("Element is present at index: "+index);
                   }                  
                break;
            case 6:System.out.println("here is the reverse of an array: ");
                   int[] rvrs={1,2,3,4,5,6,7,8,9,0};
                   System.out.println("Initially array is : ");
                   for(int i=0;i<rvrs.length;i++){
                    System.out.print(rvrs[i]+"  ");
                   }
                   reverseArrqy(rvrs);
                   for(int i=0;i<rvrs.length;i++){
                    System.out.print(rvrs[i]+"  ");
                   }
                break;
            case 7:System.out.println("Let's makes Pairs");
                   int[] pair={1,2,3,4,5,6,7,8,9,0};
                   printpairs(pair);
                break;
            case 8:System.out.println("lets see the sub-Arrays ! :");
                   int[] subarray={-1,-2,6,-1,3};
                   printsubArray(subarray);
                break;
            case 9:System.out.println("Sub-array Maximum Sum using prefix Method: ");
                   int[] prefixM={1,2,3,4,5,6};
                   prefixprintsubArray(prefixM);
                break;
            case 10:System.out.println("KADANE ALGORITHM: ");
                    int[] kalgo={-2,-3,-4,-1,-2,-5,-3};

                    kadaneAlgorithms(kalgo);
//here is the error please check for negative number 
                break;

            case 11:System.out.println("Trap water code: ");
                    int[] height={4,2,0,6,3,2,5};
                    int waterstored=TrapppedWater(height);
                    
                    System.out.println("Amount of water stored/trapped:  "+waterstored);
                break;

            case 12:System.out.println("Que 2 Array assignment : ");
                    System.out.println("Enter the target : ");
                    int target=sc.nextInt();
                    System.out.println("Enter the no. to find: ");
                    int find=sc.nextInt();
                    int[] nums={0,1,2,4,5,6,7};

                    for(int i=0;i<nums.length;i++){
                        System.out.print(nums[i]+" ");
                    }
                    int inde=unknownThings(nums, target,find);

                    System.out.println("\n Rotated array : \n");
                    for(int i=0;i<nums.length;i++){
                        System.out.print(nums[i]+" ");
                    }
                    System.out.println("\n element at : "+inde);
                break;
            case 13:System.out.println("the Maximum profit : ");
                    int[] prices={7,1,5,3,6,4};
                    int profit=buySellStocks(prices);
                    System.out.println("Maximum profit : "+profit);
                break;
            default:
                break;
        }
    }
}
