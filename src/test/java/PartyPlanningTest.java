import org.junit.Test;

import static org.junit.Assert.*;

public class PartyPlanningTest {
    @Test
    public void PartyPlanning_createsObject_true() throws Exception {
        String[] testFood = {"appetisers", "standart dinner"};
        String[] testDrinks = {"juice", "standart alcohol"};
        PartyPlanning testParty = new PartyPlanning(100, "band", testFood, testDrinks);
        assertEquals(true, testParty instanceof PartyPlanning);
    }
}