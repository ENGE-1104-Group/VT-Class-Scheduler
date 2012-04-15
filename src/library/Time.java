package library;

/**
 * // -------------------------------------------------------------------------
/**
 *  The Time class is for Time objects, which will store when a class section
 *  starts and ends.
 *
 *  @author cmbuck
 *  @version Apr 15, 2012
 */
public class Time
{
    private int hour;
    private int minute;

    /**
     * Constructs a new Time object
     * @param h the hour of this time
     * @param m the minute of this time
     */
    public Time(int h, int m)
    {
        hour = h;
        minute = m;
    }

    // ----------------------------------------------------------
    /**
     * @return the hour
     */
    public int getHour()
    {
        return hour;
    }

    // ----------------------------------------------------------
    /**
     * @return the minute
     */
    public int getMinute()
    {
        return minute;
    }

    /**
     * Determines if the two sets of times overlap at all.
     * @param firstBegin the begin time of the first section
     * @param firstEnd the end time of the first section
     * @param secondBegin the begin time of the second section
     * @param secondEnd the end time of the second section
     * @return whether these two sets of times overlap
     */
    public static boolean isOverlap(Time firstBegin, Time firstEnd,
                                    Time secondBegin, Time secondEnd)
    {
        //TODO: Implement this method

        return false;
    }


}
