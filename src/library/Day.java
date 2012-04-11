package library;

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
