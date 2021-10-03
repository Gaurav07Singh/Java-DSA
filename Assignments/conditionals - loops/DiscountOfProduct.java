package kunalwstDSA.assignment3;

public class DiscountOfProduct {
    public static void main(String[] args) {
        // Calculate Discount Of Product

        System.out.println(discout(1000 , 50));

    }
    static int discout(int price , int discountPercent) {
       int discountCost = (discountPercent* price)/100;
       int priceToPay = price - discountCost;
       return priceToPay;


    }
}
