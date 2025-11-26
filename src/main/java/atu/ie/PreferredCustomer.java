package atu.ie;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel;

    public PreferredCustomer() {
        this.loyaltyPoints = 0;
        this.discountLevel = 0;
    }

    public PreferredCustomer(int loyaltyPoints, double discountLevel) {
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
        updateDiscountLevel();
    }

    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        updateDiscountLevel();
    }

    // Updates discount based on loyalty points
    private void updateDiscountLevel() {
        if (loyaltyPoints < 500) {
            discountLevel = 0;
        } else if (loyaltyPoints <= 999) {
            discountLevel = 0.05;
        } else if (loyaltyPoints <= 1499) {
            discountLevel = 0.06;
        } else if (loyaltyPoints <= 1999) {
            discountLevel = 0.07;
        } else {
            discountLevel = 0.10;
        }
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    @Override
    public String toString() {
        return "PreferredCustomer{" +
                "customer=" + super.toString() +
                ", loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel +
                '}';
    }
}
