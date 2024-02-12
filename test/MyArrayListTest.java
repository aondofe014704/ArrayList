import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    private MyArrayList myList;

    @BeforeEach
    public void setUp(){
        myList = new MyArrayList();
    }

    @Test
    public void testThatTheArrayListIsEmptyOnCreation(){
        assertTrue(myList.isEmpty());
    }

    @Test
    public void addElementToList_listIsNotEmptyTest(){
        assertTrue(myList.isEmpty());
        myList.add("jack");
        assertFalse(myList.isEmpty());
    }
    @Test
    public void addElementToList_removeElementFromList_listIsEmpty(){
        assertTrue(myList.isEmpty());
        myList.add("jack");
        assertFalse(myList.isEmpty());
        myList.remove("jack");
    }
    @Test
    public void addTwoElements_removeOne_listIsNotEmpty(){
        assertTrue(myList.isEmpty());
        myList.add("jack");
        myList.add("mesh");
        assertFalse(myList.isEmpty());
        myList.remove("jack");
        assertFalse(myList.isEmpty());
    }
    @Test
    public void addTwoElementToList_removeTwoElementListIsEmpty(){
        assertTrue(myList.isEmpty());
        myList.add("jack");
        myList.add("mesh");
        assertFalse(myList.isEmpty());
        myList.remove("jack");
        myList.remove("mesh");
        assertTrue(myList.isEmpty());
    }
    @Test
    public void removeElementsFromEmptyList_ThrowException(){
        assertTrue(myList.isEmpty());
        assertThrows(IllegalArgumentException.class, ()->myList.remove("Mary"));

    }
}
