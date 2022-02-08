

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WordCountTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WordCountTest
{
    /**
     * Default constructor for test class WordCountTest
     */
    public WordCountTest()
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
    public void WordCountered()
    {
        WordCount wordCoun1 = new WordCount("abcdef");
        assertEquals(1, wordCoun1.getCount());
        wordCoun1.setCount(10);
        assertEquals(10, wordCoun1.getCount());
        assertEquals("abcdef", wordCoun1.getWord());
    }
}

