package library.tests;

import static org.junit.Assert.*;
import library.Time;
import org.junit.Before;
import org.junit.Test;

/**
 * // -------------------------------------------------------------------------
/**
 *  This class is for testing the Time class and its methods
 *
 *  @author cmbuck
 *  @version Apr 15, 2012
 */
public class TimeTest
{
    public Time astart, aend, bstart, bend, cstart, cend, dstart, dend;

    /**
     * This method sets up the testing environment
     */
    @Before
    public void setUp()
    {
        astart = new Time(2, 30);
        aend = new Time(3, 45);
        bstart = new Time(3, 30);
        bend = new Time(4, 45);
        cstart = new Time(2, 30);
        cend = new Time(3, 45);
        dstart = new Time(4, 0);
        dend = new Time (5, 15);

    }

    /**
     * This method tests the isOverlap() method
     */
    @Test
    public void testIsOverlap()
    {
        assertTrue(astart.isOverlap(astart, aend, bstart, bend));
        assertTrue(astart.isOverlap(astart, aend, cstart, cend));
        assertTrue(astart.isOverlap(dstart, dend, bstart, bend));
        assertFalse(astart.isOverlap(astart, aend, dstart, dend));
    }
}
