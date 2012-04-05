package library;

/**
 * // -------------------------------------------------------------------------
/**
 *  The DataHandler class is for handling, processing, and parsing the returned
 *  data from the Timetable of classes.
 *
 *  @author cmbuck
 *  @version Apr 4, 2012
 */
public class DataHandler
{
    private String data;

    /**
     * This method sets the preprocessed data; the results from the Timetable
     * HTTP request.
     */
    public void setPreprocessedData(String preprocessed)
    {
        data = preprocessed;
    }


    public void processData()
    {
        if (data != null)
        {
            data = cutData(data);              //cut to </HTML>
            data = removeTags(data);           //remove tags
            data = removeEmptyLines(data);     //remove empty lines
            //make sure it isnt an error
            //make list of sections (parse)
        }
        else
        {
            //handle null case
        }

        //set preprocessed to null once we are done with it
        //to prevent errors if this method is called twice
        data = null;
    }

    /**
     * Cuts the data string to only leave everything after </HTML>
     * @param str String to cut
     * @return The input String after being cut
     */
    public String cutData(String str)
    {
        //TODO: Implement this.  Maybe use substrings?

        return str;
    }

    /**
     * Removes all the (remaining) HTML tags
     * @param str String to remove HTML tags from
     * @return The input String with the HTML tags removed
     */
    public String removeTags(String str)
    {
        //TODO: Implement this.  Use String.replaceAll(regex, replace)

        return str;
    }

    /**
     * Removes all empty lines
     * @param str String to remove empty lines from
     * @return The input String with the empty lines removed
     */
    public String removeEmptyLines(String str)
    {
        //TODO: Implement this. Regex is possible, but there are also other ways

        return str;
    }
}
