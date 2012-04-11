package library;

import java.util.List;

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
    	int index, index2;
    	index2=str.indexOf("</html>");
    	index=str.indexOf("</HTML>");
    	if (index2==-1)
    		str=str.substring(index+7,str.length());
    	if (index==-1)
    		str=str.substring(index2+7,str.length());
        return str;
    }

    /**
     * Removes all the (remaining) HTML tags
     * @param str String to remove HTML tags from
     * @return The input String with the HTML tags removed
     */
    public String removeTags(String str)
    {
        //str.replaceAll("<+[^>]+>", "");
        int index = 0;
        String finalString = "";
        while(index < str.length())
        {
            if(str.charAt(index) == '<')
            {
                while(str.charAt(index) != '>')
                {
                    index++;
                }
                index++;
            }
            else
            {
                finalString += str.substring(index, index+1);
                index++;
            }
        }

        return finalString;
        //return str;
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

    /**
     * Parses the cleaned Timetable data string into a list of Section objects
     * @param cleanedTimetable the cleaned Timetable data string
     * @return the List of Sections
     */
    public List<Section> parseString(String cleanedTimetable)
    {
        //TODO Implement this method

        //return null for now
        return null;
    }
}
