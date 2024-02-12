package chapter3Test;

import chapter3.PetrolPurchase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {
    @Test
    public void testThatForTheLocation() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("312 Yaba", "fuel", 7, 600, 0);
        petrolPurchase.setStationLocation("314 Yaba");
        assertEquals("314 Yaba", petrolPurchase.getStationLocation());
    }

    @Test
    public void testForTheFuelType() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("312 yaba", "fuel", 7, 600, 0);
        petrolPurchase.setPetrolType("fuel");
        assertEquals("fuel", petrolPurchase.getPetrolType());
    }

    @Test
    public void testForTheFuelQuantity() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Makoko 07", "Kerosene", 500, 900, 10);
        petrolPurchase.setPetrolQuantity(500);
        assertEquals(500, petrolPurchase.getPetrolQuantity());

    }

    @Test
    public void testForThePrice() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("SemiColon Africa", "Diesel", 92, 600, 7);
        petrolPurchase.setPricePerLitre(600);
        assertEquals(600, petrolPurchase.getPricePerLitre());
    }

    @Test
    public void testForPercentage() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("312 Lagos", "Black Oil", 8, 550, 5);
        petrolPurchase.setPercentageDiscount(5);
        assertEquals(5, petrolPurchase.getPercentageDiscount());
    }

    @Test
    public void testPetrolPurchase() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Yaba Market", "fuel", 7, 600, 10);
        petrolPurchase.setPetrolQuantity(4);
        petrolPurchase.setPricePerLitre(600);
        petrolPurchase.setPercentageDiscount(0);
        assertEquals(2400, petrolPurchase.getPurchaseAmount());
    }
}