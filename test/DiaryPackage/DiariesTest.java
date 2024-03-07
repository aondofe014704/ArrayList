//package DiaryPackage;
//
//import org.junit.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//
//public class DiariesTest {
//    @Test
//    public void testToAddToDiaries() {
//        Diaries diaries = new Diaries();
//        diaries.add("userName", "password");
//        assertEquals(1, diaries.getNumOfDiaries());
//    }
//    @Test
//    public void testToAddTwiceToDiaries(){
//        Diaries diaries = new Diaries();
//        diaries.add("userName", "password");
//        diaries.add("userName", "password");
//        assertEquals(2, diaries.getNumOfDiaries());
//    }
//    @Test
//    public void testToFindByUsername(){
//        Diaries diaries = new Diaries();
//        diaries.add("userName", "password");
//        Diary diary = diaries.findByUsername("userName");
//        assertEquals(diary, diaries.findByUsername("userName"));
//    }
//    @Test
//    public void testToDeleteADiary(){
//    Diaries diaries = new Diaries();
//    diaries.add("userName", "password");
//    diaries.deleteDiary("userName", "password");
//    }
//
//}