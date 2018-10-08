import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
/**
 * Created by shailendralohia on 10/2/18.
 */
public class StackExampleTest {
    private StackExample stackExample;

    @Test
    public void testSizeFunction() {
        stackExample=new StackExample();
        assertEquals(0,stackExample.size());
    }
    @Test
    public void testPushFunction() {
        stackExample=new StackExample();
        stackExample.push(5);
        assertEquals(1,stackExample.size());
    }
    @Test
    public void testTopFunction() {
        stackExample=new StackExample();
        stackExample.push(5);
        assertEquals(5,stackExample.top());
    }
    @Test
    public void testIsEmpty() {
        stackExample=new StackExample();
        assertTrue(stackExample.isEmpty());
    }
    @Test
    public void testNotEmpty() {
        stackExample=new StackExample();
        stackExample.push(5);
        assertFalse(stackExample.isEmpty());
    }
    @Test
    public void testPopFunction() {
        stackExample=new StackExample();
        stackExample.push(10);
        stackExample.push(20);
        stackExample.pop();
        assertEquals(1,stackExample.size());
    }
}
