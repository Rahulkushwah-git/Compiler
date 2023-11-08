import java.util.*;

public class problem {
    public static void main(String arg[]){
        StringBuilder sb=new  StringBuilder("This is to inform that you are selected one by the cosmos");
        int count =0;
        StringBuilder sub=new StringBuilder();
         StringBuilder sub1=new StringBuilder();
        for(int i=0;i<=sb.length();i++){
            int t;
            
            
            if(i==sb.length() || sb.charAt(i)==' '){
                t=i;
                  sub=new StringBuilder(sb.substring(count,t));
                 
                 for(int j=0;j<=sub.length()/2;j++){
                    int front=j;
                    int back=sub.length()-1-j;
        
                    char frontChar=sub.charAt(front);
                    char backChar=sub.charAt(back);
        
                    sub.setCharAt(front, backChar);
                    sub.setCharAt(back, frontChar);
                }
                //i=t;
                sub1.append(sub).append(" ");
                count=t+1;
                //sb.replace(i, t, sub.toString());
                //sb.replace(i, t, sub);
                //sb.concat(" "+ sub);
            }
            
        }
         
        System.out.println(sub1.toString().trim());
    }
    
}
