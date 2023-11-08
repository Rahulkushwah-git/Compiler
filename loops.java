import java.util.*;

public class loops {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose table you want to print : ");
        int b=sc.nextInt();
        System.out.println("Enter the number of output : ");
        int a=sc.nextInt();
        /*
        for(int i=0;i<=a;i++){
            System.out.println(i);
        } */
        int temp =0,i=0;
        /* 
        while(i<=a){
            System.out.println(i);
            i+=1;
        }*/
        /*
        do{
            System.out.println(i);
            i+=1;
        }while(i<=a); */

//sum of n=a natural number 
/* 
        for(i=1;i<=a;i++){
            temp+=i;
            
        }
        System.out.println(temp);*/
/*
        while(i<=a){
            temp+=i;
            i+=1;
        }
        System.out.println(temp); */
/* 
        do{
            temp+=i;
            i+=1;
            
        }while(i<=a);
        System.out.println(temp);*/
//table printed

        int mul=0;
         for(i=0;i<=a;i++){
            mul= b*i;
            System.out.println( mul);
         }





    }
    
}
