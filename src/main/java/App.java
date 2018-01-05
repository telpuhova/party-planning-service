import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class App {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("How many guests are coming?");
            int guestCount = parseInt(bufferedReader.readLine());
            System.out.println("Do you want a band or a dj?");
            String entertainment = bufferedReader.readLine();
            System.out.println("Choose food menu: budget, standard or premium");
            String food = bufferedReader.readLine();
            System.out.println("Choose beverages menu: budget, standard or premium");
            String drinks = bufferedReader.readLine();

            System.out.println("Do you have a coupon you want to use?");
            String couponAnswer = bufferedReader.readLine();

            String couponNumber = "";
            if (couponAnswer.equals("yes")) {
                System.out.println("Enter a coupon number");
                couponNumber = bufferedReader.readLine();
            } else {}


            PartyPlanning party = new PartyPlanning(guestCount, entertainment, food, drinks);
            party.setCouponNumber(couponNumber);
            int cost = party.calculateCost();
            System.out.print("Your party will cost about ");
            System.out.println(cost);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
