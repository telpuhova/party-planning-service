import org.junit.Test;

import static org.junit.Assert.*;

public class PartyPlanningTest {
    @Test
    public void PartyPlanning_createsObject_true() throws Exception {
        PartyPlanning testParty = new PartyPlanning(100, "band", "budget", "budget");
        assertEquals(true, testParty instanceof PartyPlanning);
    }

    @Test
    public void PartyPlanning_fieldFoodFilledCorrectly_stringArray() throws Exception {
        PartyPlanning testParty = new PartyPlanning(100, "band", "budget", "budget");
        String expected = "budget";
        assertEquals(expected, testParty.getFood());
    }

    @Test
    public void calculateCost_returnsCostOnGuestCountForCheapParty_200() throws Exception {
        int expected = 200;
        PartyPlanning testParty = new PartyPlanning(10, "", "budget", "budget");
        assertEquals(expected, testParty.calculateCost());
    }

    @Test
    public void calculateCost_returnsCostOnGuestCountForStandardParty_400() throws Exception {
        int expected = 400;
        PartyPlanning testParty = new PartyPlanning(10, "", "standard", "standard");
        assertEquals(expected, testParty.calculateCost());
    }

    @Test
    public void calculateCost_returnsCostOnGuestCountForExpParty_600() throws Exception {
        int expected = 600;
        PartyPlanning testParty = new PartyPlanning(10, "", "premium", "premium");
        assertEquals(expected, testParty.calculateCost());
    }

    @Test
    public void calculateCost_returnsCostOnGuestCountForMixedParty_500() throws Exception {
        int expected = 500;
        PartyPlanning testParty = new PartyPlanning(10, "", "standard", "premium");
        assertEquals(expected, testParty.calculateCost());
    }

    @Test
    public void calculateCost_returnsCostOnGuestCountForCheapPartyWithDJ_300() throws Exception {
        int expected = 300;
        PartyPlanning testParty = new PartyPlanning(10, "dj", "budget", "budget");
        assertEquals(expected, testParty.calculateCost());
    }

    @Test
    public void calculateCost_returnsCostOnGuestCountForCheapPartyWithBand_400() throws Exception {
        int expected = 400;
        PartyPlanning testParty = new PartyPlanning(10, "band", "budget", "budget");
        assertEquals(expected, testParty.calculateCost());
    }

    @Test
    public void calculateCost_returnsCostWithCouponOne_3200() throws Exception {
        int expected = 3200;
        PartyPlanning testParty = new PartyPlanning(160, "dj", "budget", "budget");
        testParty.setCouponNumber("1234");
        assertEquals(expected, testParty.calculateCost());
    }

    @Test
    public void calculateCost_returnsCostWithCouponOne_150() throws Exception {
        int expected = 150;
        PartyPlanning testParty = new PartyPlanning(10, "", "budget", "budget");
        testParty.setCouponNumber("5678");
        assertEquals(expected, testParty.calculateCost());
    }
}