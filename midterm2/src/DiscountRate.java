public class DiscountRate {
    static double serviceDiscountPremium = 0.2;
    static double serviceDiscountGold = 0.15;
    static double serviceDiscountSilver = 0.1;
    static double productDiscountPremium = 0.1;
    static double productDiscountGold = 0.1;
    static double productDiscountSilver = 0.1;

    static double getServiceDiscountRate(String str){
        if(str == "Premium") return serviceDiscountGold;
        if(str == "Gold") return serviceDiscountGold;
        if(str == "Silver") return serviceDiscountSilver;
        return 0;
     }
     static double getProductDiscountRate(String str){
        if((str.equals("Premium")) || str.equals("Gold") || str.equals("Silver"))
            return 0.1;
        return 0;
     }
}