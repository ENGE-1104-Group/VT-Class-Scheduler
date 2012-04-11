package library.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import library.DataHandler;
import org.junit.Before;

/**
 * // -------------------------------------------------------------------------
/**
 *  This class is for testing the DataHandler Class and its methods
 *
 *  @author cmbuck
 *  @version Apr 4, 2012
 */
public class DataHandlerTest
{

    DataHandler dh;

    /**
     * Sets up for the tests
     */
    @Before
    public void setUp()
    {
        dh = new DataHandler();
    }

    /**
     * Tests the cutData method
     */
    @Test
    public void testCutData()
    {
        String data1 = "asdf\nasdf </HTML>\n 123";
        String data2 = "<HTML>asdf\n<b>asdf</b> </HTML>\n<p>123";
        String data3 = "<html>asdf\nasdf </html>\n<p>123";
        String data4 = "<html>asdf\nasdf \n<p>123</html>";
        assertEquals("\n 123", dh.cutData(data1));
        assertEquals("\n<p>123", dh.cutData(data2));
        assertEquals("\n<p>123", dh.cutData(data3));
        assertEquals("", dh.cutData(data4));

        //TODO: Add more test cases
    }

    /**
     * Tests the removeTags() method
     */
    @Test
    public void testRemoveTags()
    {
        String data1 = "<b>this is bold</b>";
        String data2 = "<font style='asdfasdfasdf'>blah\n</font>";
        String data3 = "<super tag \n and \n more...>123";

        assertEquals("this is bold", dh.removeTags(data1));
        assertEquals("blah\n", dh.removeTags(data2));
        assertEquals("123", dh.removeTags(data3));
    }

    /**
     * Tests the removeEmptyLines method
     */
    @Test
    public void testRemoveEmptyLines()
    {
        //TODO: Write tests
    }
}
