package kunalwstDSA.assignment3;

public class ElectricityBill {
    public static void main(String[] args) {

        // Calculate Electricity Bill.
        int pricePerUnit = 12;
        int unitsConsumed = 85;
        bill(pricePerUnit , unitsConsumed);

    }
    static void bill(int pricePerUnit , int  unitsConsumed) {
        int cost = pricePerUnit*unitsConsumed;

        System.out.println("Bill amount is: " + cost);
    }

}
