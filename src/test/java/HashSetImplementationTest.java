import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class HashSetImplementationTest {
    private HashSetImplementation hashSetImplementation;
    // isEmpty
    // notEmpty
    // add
    // contain
    // remove
    // Size

    @Test
    public void isEmptyFunction() {
        hashSetImplementation=new HashSetImplementation();
        assertTrue(hashSetImplementation.isEmpty());
    }
    @Test
    public void sizeFunction() {
        hashSetImplementation=new HashSetImplementation();
        assertEquals(0,hashSetImplementation.size());
    }
    @Test
    public void addFunction() {
        hashSetImplementation=new HashSetImplementation();
        hashSetImplementation.add(10);
        hashSetImplementation.add(20);
        assertEquals(2,hashSetImplementation.size());
    }
    @Test
    public void containsFunction() {
        hashSetImplementation=new HashSetImplementation();
        hashSetImplementation.add(10);
        hashSetImplementation.add(20);
        //hashSetImplementation.contains(10);
        assertEquals(true,hashSetImplementation.contains(10));
    }
    @Test
    public void removeFunction() {
        hashSetImplementation=new HashSetImplementation();
        hashSetImplementation.add(10);
        hashSetImplementation.add(20);
        hashSetImplementation.remove(20);
        //assertEquals(1,hashSetImplementation.size());
        assertEquals(true,hashSetImplementation.contains(10));
    }
    @Test
    public void isNotEmptyFunctionTest() {
        hashSetImplementation=new HashSetImplementation();
        hashSetImplementation.add(20);
        assertEquals(false,hashSetImplementation.isEmpty());
    }
    @Test
    public void validateDuplicateInAddFunction() {
        hashSetImplementation=new HashSetImplementation();
        hashSetImplementation.add(20);
        hashSetImplementation.add(10);
        hashSetImplementation.add(30);
        hashSetImplementation.add(10);
        assertEquals(3,hashSetImplementation.size());
    }
    /*@Test(expected = IndexOutOfBoundsException.class)
    public void test() {
        hashSetImplementation=new HashSetImplementation();
        hashSetImplementation.add(10);
        hashSetImplementation.add(20);
        hashSetImplementation.add(30);
        hashSetImplementation.add(40);
        hashSetImplementation.add(50);
        hashSetImplementation.add(60);
        hashSetImplementation.add(70);
        hashSetImplementation.add(80);
        hashSetImplementation.add(90);
        hashSetImplementation.add(100);
        hashSetImplementation.add(110);
    }*/

}
