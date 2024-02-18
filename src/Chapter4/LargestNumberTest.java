package Chapter4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestNumberTest {
    @Test
    public void testThatClassLargestNumberExist(){
        LargestNumber largestNumber = new LargestNumber();
        int x =largestNumber.collectingNumbers(1,2,3,4,5,6,7,8,9);
        assertEquals(9,x);
    }
}
