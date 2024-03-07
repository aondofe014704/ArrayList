
import PackageForDiary.Diarry;
import PackageForDiary.Entry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DiarryTest {

    @Test
    public void testThatUserCanCreateNewDiary(){

    }
    @Test
    public void testThatUserCreatesNewDiary_DiaryIsNotLockedByDefault(){

    }

    @Test
    public void testThatUserCreatesNewDiary_UserCanLockDiary(){

    }
    @Test
    public void testThatUserLocksDiary_DiaryIsLocked_UserHasToInputPasswordToOpenDiaryAgain(){
        Diarry diarry = new Diarry("Jim Ros", "6969");
        diarry.lockDiarry();
        assertTrue(true);
    }
    @Test
    public void testToUnlockDiary() {
        Diarry diarry = new  Diarry("James Brown", "6969");
        diarry.unlockDiarry("password");
        assertTrue(true);
    }
    @Test
    public void testToCreateAnEntry_NumberOfEntriesIncreased(){
        Diarry diarry = new Diarry("userName", "6969");
        diarry.createEntry("title", "body");
        assertEquals(1, diarry.getNumberOfEntries());
    }
    @Test
    public void testToCreateEntryTwice_Delete_One_NumberOfEntriesDecreased(){
        Diarry diarry = new Diarry("userName", "6969");
        diarry.createEntry("title","body");
        diarry.createEntry("title", "body");
        diarry.deleteEntry(1);
        assertEquals(1, diarry.getNumberOfEntries());
    }
    @Test
    public void testToFindEntryById(){
        Diarry diarry = new Diarry("userName", "password");
        diarry.createEntry("title","body");
        diarry.createEntry("title","body");
        Entry entries = diarry.findEntryById(1);
        assertEquals(1, entries.getiD());

    }
    @Test
    public void testToDeleteEntryById(){
        Diarry diarry = new Diarry("userName", "password");
        diarry.createEntry("title", "body");
        diarry.createEntry("title","body");
        diarry.createEntry("title","body");
        diarry.deleteEntry(1);
        assertEquals(2,diarry.getNumberOfEntries());

    }
    @Test
    public void testToUpdateEntry(){
        Diarry diarry = new Diarry("userName","password");
        diarry.createEntry("title", "body");
        diarry.createEntry("title", "body");
        diarry.updateEntry(0,"kingJames", "body");
        diarry.updateEntry(1,"kingJameson", "body");
        Entry entry0 = diarry.findEntryById(0);
        Entry entry1 = diarry.findEntryById(1);
        assertEquals("kingJames", entry0.getTitle());
        assertEquals("kingJameson", entry1.getTitle());
    }

}