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

        }

        private void updateDiscountLevel() {
            if (loyaltyPoints < 500) {
                discountLevel = 0;


            }
        }
    }