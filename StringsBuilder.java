import java.util.*;

public class StringsBuilder {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("This is to inform you about rahul kushwah");
        System.out.println(sb);
       /* / System.out.println(" "+sb.charAt(0));
        sb.setCharAt(2,'l');
        System.out.println(sb);

        sb.insert(1,'p');
        System.out.println(sb);

        sb.delete(4, 5);
        System.out.println(sb);

        sb.append("rk");
        System.out.println(sb);  */

        for(int i=0;i<=sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);



    }
    
}
