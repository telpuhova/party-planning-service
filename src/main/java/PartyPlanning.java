public class PartyPlanning {
    int guestCount;
    String entertainment;
    String food;
    String drinks;
    String couponNumber = "";
    int cost = 0;

    public int getGuestCount() {
        return guestCount;
    }
    public String getEntertainment() {
        return entertainment;
    }
    public String getFood() {
        return food;
    }
    public String getDrinks() {
        return drinks;
    }

    public void setCouponNumber(String cn) {
        couponNumber = cn;
    }

    PartyPlanning(int inputGuestCount, String inputEntertainment, String inputFood, String inputDrinks) {
        guestCount = inputGuestCount;
        entertainment = inputEntertainment;
        food = inputFood;
        drinks = inputDrinks;
    }

    public int calculateCost() {
        int foodCostPerPerson;
        int drinksCostPerPerson;
        int entertainmentCost;

        switch (food) {
            case "budget": foodCostPerPerson = 10;
                break;
            case "standard": foodCostPerPerson = 20;
                break;
            case "premium": foodCostPerPerson = 30;
                break;
            default: foodCostPerPerson = 0;
        }

        switch (drinks) {
            case "budget": drinksCostPerPerson = 10;
                break;
            case "standard": drinksCostPerPerson = 20;
                break;
            case "premium": drinksCostPerPerson = 30;
                break;
            default: drinksCostPerPerson = 0;
        }

        switch (entertainment) {
            case "dj": entertainmentCost = 100;
                break;
            case "band": entertainmentCost = 200;
                break;
            default: entertainmentCost = 0;
        }

        int couponBenefit = 0;
        if (couponNumber.equals("1234")) {
            if ((guestCount >= 150) && (entertainment.equals("dj"))) {
                entertainmentCost = 0;
            }
        } else if (couponNumber.equals("5678")) {
            couponBenefit = 50;
        } else {}

        int costPerPerson = foodCostPerPerson + drinksCostPerPerson;
        cost = guestCount * costPerPerson + entertainmentCost - couponBenefit;

        return cost;
    }
}
