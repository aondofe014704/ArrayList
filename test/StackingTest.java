import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackingTest{
    @Test
    public void testThatTheStackIsEmpty(){
    StackClass stackClass = new StackClass();
    stackClass.isStackEmpty();
    assertTrue(stackClass.isStackEmpty());
    }
    @Test
    public void testThatTheWeCanPushToAStack_StackIsNotEmpty(){
    StackClass stackClass = new StackClass();
    assertTrue(stackClass.isStackEmpty());
    stackClass.push(12);
    assertFalse(stackClass.isStackEmpty());
    }
    @Test
    public void testThatWeCanPushTwoElementToStack_AndRemoveOne(){
    StackClass stackClass = new StackClass();
    assertTrue(stackClass.isStackEmpty());
    stackClass.push(24);
    stackClass.push(90);
    assertFalse(stackClass.isStackEmpty());
    stackClass.pop(90);
    }
    @Test
    public void testThatWeCanPushTwoElementToStack_AndRemoveAll(){
        StackClass stackClass = new StackClass();
        assertTrue(stackClass.isStackEmpty());
        stackClass.push(50);
        stackClass.push(70);
        assertFalse(stackClass.isStackEmpty());
        stackClass.pop(50);
        stackClass.pop(70);
        assertTrue(stackClass.isStackEmpty());
    }


}