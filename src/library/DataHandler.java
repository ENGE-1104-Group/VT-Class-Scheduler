package library;

import java.util.ArrayList;
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

            String dataArray[];
            dataArray = splitAndRemoveEmptyLines(data);     //remove empty lines

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
     * Splits and removes empty lines
     * @param str String to remove empty lines from
     * @return processed String array without empty entries
     */
    public String[] splitAndRemoveEmptyLines(String str)
    {
        String[] data = str.split("\n");

        //count the non-empty entries
        int count = 0;
        for (int i=0; i < data.length; i++)
        {
            if (!data[i].equals(""))
                count++;
        }

        String ret[] = new String[count];
        count = 0;
        for (int i=0; i < data.length; i++)
        {
            if (!data[i].equals(""))
                ret[count++] = data[i];
        }

        return ret;
    }

    /**
     * Parses the cleaned Timetable data string into a list of Section objects
     * @param cleanedTimetable the cleaned Timetable data string
     * @return the List of Sections
     */
    public List<Section> parseString(String[] cleanedTimetable)
    {

        Section currentSection;
        int index = 0;

        //parse sections
        //while there is another section
        while ((index = nextCRN(cleanedTimetable, index)) != -1)
        {
            currentSection = new Section();

            //start parsing
            parseCRN(cleanedTimetable, index, currentSection);
            parseCourse(cleanedTimetable, index, currentSection);
            parseTitle(cleanedTimetable, index, currentSection);
            parseType(cleanedTimetable, index, currentSection);
            parseHrs(cleanedTimetable, index, currentSection);
            parseCapacity(cleanedTimetable, index, currentSection);
            parseInstructor(cleanedTimetable, index, currentSection);
            parseDays(cleanedTimetable, index, currentSection);
            parseBegin(cleanedTimetable, index, currentSection);
            parseEnd(cleanedTimetable, index, currentSection);
            parseLocation(cleanedTimetable, index, currentSection);
            parseExam(cleanedTimetable, index, currentSection);
            //handle Additional Times
        }

        //return null for now
        return null;
    }



    public int nextCRN(String[] cleanedTimetable, int index)
    {
        // TODO Auto-generated method stub
        return 0;
    }


    public void parseCRN(
        String[] cleanedTimetable,
        int index,
        Section currentSection)
    {
        // TODO Auto-generated method stub

    }


    public void parseCourse(
        String[] cleanedTimetable,
        int index,
        Section currentSection)
    {
        // TODO Auto-generated method stub

    }


    public void parseTitle(
        String[] cleanedTimetable,
        int index,
        Section currentSection)
    {
        // TODO Auto-generated method stub

    }


    public void parseType(
        String[] cleanedTimetable,
        int index,
        Section currentSection)
    {
        // TODO Auto-generated method stub

    }


    public void parseHrs(
        String[] cleanedTimetable,
        int index,
        Section currentSection)
    {
        // TODO Auto-generated method stub

    }


    public void parseCapacity(
        String[] cleanedTimetable,
        int index,
        Section currentSection)
    {
        // TODO Auto-generated method stub

    }


    public void parseInstructor(
        String[] cleanedTimetable,
        int index,
        Section currentSection)
    {
        // TODO Auto-generated method stub

    }


    public void parseDays(
        String[] cleanedTimetable,
        int index,
        Section currentSection)
    {
        // TODO Auto-generated method stub

    }


    public void parseBegin(
        String[] cleanedTimetable,
        int index,
        Section currentSection)
    {
        // TODO Auto-generated method stub

    }


    public void parseEnd(
        String[] cleanedTimetable,
        int index,
        Section currentSection)
    {
        // TODO Auto-generated method stub

    }


    public void parseLocation(
        String[] cleanedTimetable,
        int index,
        Section currentSection)
    {
        // TODO Auto-generated method stub

    }


    public void parseExam(
        String[] cleanedTimetable,
        int index,
        Section currentSection)
    {
        // TODO Auto-generated method stub

    }



}
