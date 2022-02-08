

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TreeMultiSetTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TreeMultiSetTest
{
    /**
     * Default constructor for test class TreeMultiSetTest
     */
    public TreeMultiSetTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void Test()
    {
    }

    @Test
    public void test()
    {
        TreeMultiSet treeMult1 = new TreeMultiSet();
        treeMult1.add("yes");
        assertEquals(true, treeMult1.contains("yes"));
        assertEquals(false, treeMult1.contains("no"));
        assertEquals(1, treeMult1.getSize());
        assertEquals(true, treeMult1.removeOne("yes"));
    }
}


