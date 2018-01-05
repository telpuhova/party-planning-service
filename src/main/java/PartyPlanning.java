public class PartyPlanning {
    int guestCount;
    String entertainment;
    String[] food;
    String[] drinks;

    public int getGuestCount() {
        return guestCount;
    }
    public String getEntertainment() {
        return entertainment;
    }
    public String[] getFood() {
        return food;
    }
    public String[] getDrinks() {
        return drinks;
    }

    PartyPlanning(int inputGuestCount, String inputEntertainment, String[] inputFood, String[] inputDrinks) {
        guestCount = inputGuestCount;
        entertainment = inputEntertainment;
        food = inputFood;
        drinks = inputDrinks;
    }

    public int calculateCost() {
        return 0;
    }
}
