import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by shailendralohia on 10/1/18.
 */
public class SetExampleTest {
    SetExample setExample;


    @Test
    public void testIsEmpty() {
        setExample = new SetExample();

        assertTrue(setExample.isEmpty());
//        assertEquals(true,setExample.isEmpty());
    }
    @Test
    public void testSizeFunction() {
        setExample = new SetExample();
        assertEquals(0,setExample.size());
    }

    @Test
    public void testAddFunction() {
        setExample = new SetExample();
        int initialSize=setExample.size();
        setExample.add(5);
        int finalSize= setExample.size();
        assertEquals(initialSize+1,finalSize);

    }

    @Test
    public void testContainFunction() {
        setExample = new SetExample();
        setExample.add(5);
        assertTrue(setExample.contains(5));
    }

    @Test
    public void testRemoveFunction() {
        setExample = new SetExample();
        setExample.add(5);
        setExample.remove(5);
        assertTrue(setExample.isEmpty());
    }
    /*@Test
    public void testPopFunction() {
        setExample=new SetExample();
        setExample.add(10);
        setExample.add(20);
        setExample.pop(20);
        assertEquals(1, setExample.size());
    }*/
}
