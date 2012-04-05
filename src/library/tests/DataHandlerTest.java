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
        assertEquals(" 0123", dh.cutData(data1));
        assertEquals("<p>123", dh.cutData(data2));
        assertEquals("<p>123", dh.cutData(data3));

        //TODO: Add more test cases
    }

    /**
     * Tests the removeTags() method
     */
    @Test
    public void testRemoveTags()
    {
        //TODO: Write tests
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
