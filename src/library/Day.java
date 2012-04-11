package library;

/**
 * // -------------------------------------------------------------------------
/**
 *  The Day enum is for specifying days that classes meet in Section objects
 *
 *  @author cmbuck
 *  @version Apr 11, 2012
 */
public enum Day
{
    MONDAY      ('M'),
    TUESDAY     ('T'),
    WEDNESDAY   ('W'),
    THURSDAY    ('R'),
    FRIDAY      ('F');

    private final char dayChar;
    Day(char dayChar)
    {
        this.dayChar = dayChar;
    }

    private double dayChar()
    {
        return dayChar;
    }
}
