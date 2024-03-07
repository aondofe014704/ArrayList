package PackageForDiary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiarriesTest {
    @Test
    public void testToAddDiarry_IntoDiarries() {
        Diarries diarries = new Diarries();
        diarries.add("userName", "7777");
        diarries.add("Coutinho", "7778");
        diarries.add("Dominic", "7779");
        diarries.add("Jack", "7770");
        diarries.add("Awesome", "7775");
        assertEquals(5, diarries.getNumberOfDiarries());
    }

    @Test
    public void testToFindDiary_UserName() {
        Diarries diarries = new Diarries();
        diarries.add("Songu", "7771");
        diarries.add("Zigi", "7775");
        diarries.add("Sunny", "7772");
        assertEquals("Songu", diarries.findByUserName("Songu").get(0).getUserName());
    }
    @Test
    public void testToDeleteDiary_ByUsernameAndPassword(){
        Diarries diarries =  new Diarries();
        diarries.add("James Brown", "7770");
        diarries.add("Jameson Shark", "7790");
        diarries.add("Lionel Messi", "7799");
        assertEquals(3, diarries.getNumberOfDiarries());
        diarries.delete("James Brown", "7770");
        assertEquals(2, diarries.getNumberOfDiarries());
    }
}
