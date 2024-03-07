//import DiaryPackage.Diary;
//import DiaryPackage.Entry;
//import MyBankApplication.InvalidPinException;
//import org.junit.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class DiaryTest {
//    @Test
//    public void testThatDiaryIsLockedOnCreation(){
//        Diary diary = new Diary("King","Pin");
//        assertTrue(diary.isLocked());
//    }
//    @Test
//    public void testToLockDiary(){
//        Diary diary = new Diary("King","Pin");
//        diary.locked();
//        assertTrue(diary.locked());
//    }
//    @Test
//    public void testToUnLuckDiary(){
//        Diary diary = new Diary("King", "Perry");
//        diary.isLocked();
//        diary.locked();
//        assertTrue(diary.unLocked("Perry"));
//    }
//    @Test
//    public void testWhenAUserEnterWrongPassword(){
//        Diary diary = new Diary("King", "Perry");
//        diary.isLocked();
//        diary.locked();
//        assertThrows(InvalidPinException.class,()-> diary.unLocked("Perrys"));
//
//    }
//    @Test
//    public void testToCreateEntry_EntryIncreases(){
//        Diary diary = new Diary("King", "Perry");
//        diary.createEntry("title", "body");
//        assertEquals(1,diary.checkSizeOfTheList());
//   }
//    @Test
//    public void testToCreateTwoEntries_Entry_ListIncreases(){
//        Diary diary = new Diary("King","Perry");
//        diary.createEntry("title","body");
//        diary.createEntry("title", "body");
//        assertEquals(2, diary.checkSizeOfTheList());
//    }
//    @Test
//    public void testToDeleteAnEntry_EntryListDecreases(){
//        Diary diary = new Diary("King","Perry");
//        diary.createEntry("title", "body");
//        diary.deleteEntry(1);
//        assertEquals(0,diary.checkSizeOfTheList());
//
//    }
//    @Test
//    public void testToAddThreeEntries_DeleteTwo_ListEquals1(){
//        Diary diary = new Diary("userName", "password");
//        diary.createEntry("title", "body");
//        diary.createEntry("title", "body");
//        diary.createEntry("title", "body");
//        diary.deleteEntry(3);
//        diary.deleteEntry(2);
//        assertEquals(1,diary.checkSizeOfTheList());
//    }
//    @Test
//    public void testToUpdateEntry(){
//        Diary diary = new Diary("userName", "password");
//        diary.createEntry("title", "body");
//        diary.updateEntry(1, "new title", "new body");
//        Entry entry =diary.findEntryById(1);
//        assertEquals("new title", entry.getTitle());
//        assertEquals("new body", entry.getBody());
//
//    }
//
//}