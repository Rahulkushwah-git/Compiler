import java.util.*;
public class prj {
    public static float StockBuy(float amount,float dailyinves,int n,float amountmade){
        float totalvol;  //this is for when amount made is calculated then totalvol =amountmade initially amountmade is zero
        float buybrok=0; //this is to for buy brokerage
        float totalvolsell=0;
        for(int i=1;i<=n;i++){ //this is for number of days n indiacaates number of days
            if(i==1){
                totalvol=amount+dailyinves;//totalvol is amount + dailyinves because both become a totalvol to be further invested
                buybrok=totalvol*2/100; //for calculating buybrok which is applied on totalvol
                totalvolsell=totalvol-buybrok; //total ammount invested or we can say that this is amount is available for sell
            }
            else{
                totalvol=amountmade+dailyinves;//totalvol is amount + dailyinves because both become a totalvol to be further invested
                buybrok=totalvol*2/100; //for calculating buybrok which is applied on totalvol
                totalvolsell=totalvol-buybrok; //total ammount invested or we can say that this is amount is available for sell
            }              
            
        }
        //StockBuy(amount, dailyinves, n, amountmade);
        return totalvolsell;
    }
    public static float StockSell(float totalvolsell,float profper,int n){
        
        float sellbrok=0;
        float amountmade=0;
        for(int i=1;i<=n;i++){//this is for number of days n indiacaates number of days
            //total_vol_sell=total_vol-buy_brok;
            sellbrok= totalvolsell*2/100;   // to calculate sell brokerage 
            //total_vol_sell=total_vol_sell-sell_brok;
            totalvolsell-=sellbrok;
            amountmade=totalvolsell+(totalvolsell*profper/100); //amountmade is equal to totalvolsell + profit calculated
        }
        //StockSell(totalvolsell, profper, n);
        return amountmade;

    }
    public static float profit(float amountmade,float totalvolsell,int n){
        float profitMade=0;
        for(int i=1;i<=n;i++){   //this is for number of days n indiacates number of days
            profitMade =amountmade-totalvolsell; // profitmade is amountmade after trading -totalvolsell available for sell
        }    
        //profit(amountmade, totalvolsell, n);
        return profitMade;
    }


    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the amount/balance with: ");
        float amount=sc.nextFloat();
        System.out.println("daily investe : ");
        float dailyinves=sc.nextFloat();
        System.out.println("Enter the percentage: ");
        float profper=sc.nextFloat();
        System.out.println("Enter the number day : ");
        int n=sc.nextInt();

        float buybrok=StockBuy(amount, dailyinves, n, amount);
        //float total_vol=StockBuy(amount, daily_inves, n, amount);
        float totalvolsell=StockBuy(amount, dailyinves, n,amount);

        float sellbrok=StockSell(totalvolsell, profper, n);
        float amountmade=StockSell(totalvolsell, profper, n);

        float profitMade=profit(amountmade, totalvolsell,n);

        StockBuy(amount, dailyinves,n,amountmade);
        StockSell(totalvolsell, profper, n);
        profit(amountmade, totalvolsell,n);
        
        for(int i=1;i<=n;i++){
            System.out.println("Amount invested: "+totalvolsell+"\t buyied brokerage : "+buybrok+"\t  Amount to sell: "+(totalvolsell)+"\n sell brok: "+sellbrok+"\t Amount made : "+amountmade+"\t Profit Made : "+profitMade+"\n");
        }
        
        
    }
    
}
