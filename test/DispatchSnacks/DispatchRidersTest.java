package DispatchSnacks;

import DiaryPackage.D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DispatchRidersTest {
    @Test
    public void testThatIfCollectionRateIs80_RidersWage_Is_45000(){
        DispatchRiders.percentageCalculator(80);
        assertEquals(45000, DispatchRiders.percentageCalculator(80));
    }
    @Test
    public void testThatIfCollectionRateIs25_RidersWage_Is_9000(){
        assertEquals(9000, DispatchRiders.percentageCalculator(25));
    }
    @Test
    public void testThatIfCollectionRate_Is_less_Than_Zero(){
        assertThrows(IllegalArgumentException.class,()-> DispatchRiders.percentageCalculator(-700));

    }

}