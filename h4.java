import java.util.*;
//import java.io.*;
public class h4 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1,2,3:");
        int ch=sc.nextInt();
       // int i=a;
        switch(ch){
            case 1:System.out.println("Enter the value of n upto which you want to find the even number : ");
            int a=sc.nextInt();
        
            for(int i=0;i<=a;i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
            break;

            case 2:a=0;
            do{
                System.out.println("Enter either 1 or 0: ");
                a=sc.nextInt();
                if(a==1){
                    int marks=0;
                    System.out.println("Enter the marks: ");
                    marks=sc.nextInt();
                   if(marks>=90){
                    System.out.println("This is good");
                    }
                   
                   else if(marks>=60 && marks<=89){
                    System.out.println("This is also good");
                   }
                   else if(marks>=0 && marks<=59){
                    System.out.println("This is good as well");
                   }
                   System.out.println("Because marks doesn't matter efforts does ");
                }
            }while(a!=0);
            
            break;

            case 3:System.out.println("Enter the number upto which you want to find the prime number : ");
            a=sc.nextInt();
            for(int i=2;i<=a;i++){
                if(i % i == 0 && i % 1 == 0 ){
                    System.out.println(i);
                }
            }
            break;

            default:System.out.println("Andhe bhere! ");

       

        }
    
    }
}