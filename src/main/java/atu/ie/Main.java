package atu.ie;

public class Main {
    public static void main(String[] args) {

        PreferredCustomer pc = new PreferredCustomer();

        pc.setName("Charlie Customer");
        pc.setAddress("3 Middle Road");
        pc.setPhoneNumber("0871112222");
        pc.setCustomerNumber(2001);
        pc.setMailingList(true);

        // First print
        System.out.println("Initial: " + pc);

        // Add 700 points
        pc.addLoyaltyPoints(700);
        System.out.println("After adding 700: " + pc);

        // Add another 800 points
        pc.addLoyaltyPoints(800);
        System.out.println("After adding 800: " + pc);
    }
}
