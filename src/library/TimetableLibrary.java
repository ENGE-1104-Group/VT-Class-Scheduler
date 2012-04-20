package library;

import java.util.List;

/**
 * // -------------------------------------------------------------------------
/**
 *  The TimetableLibrary class is for interfacing and integrating all the other
 *  inner classes and functions of the Library.  Use an instance of this class
 *  to perform all library operations
 *
 *  @author cmbuck
 *  @version Apr 20, 2012
 */
public class TimetableLibrary
{
    DataHandler dataHandler;
    NetworkHandler networkHandler;
    Search search;

    /**
     * Create a default TimetableLibrary object
     */
    private TimetableLibrary()
    {
        dataHandler = new DataHandler();
        networkHandler = new NetworkHandler();
        search = new Search();
        search.setDefaults();
    }

    /**
     * Create a TimetableLibrary with the specified URL
     * @param timetableURL the URL of the Timetable to use
     */
    public TimetableLibrary(String timetableURL)
    {
        this();
        networkHandler = new NetworkHandler(timetableURL);
    }

    /**
     * Search the Timetable by term, subject code, and course number
     * @param
     * @param
     * @param
     * @return
     */
    public List<Section> getSections(String termYear,
                                     String subjectCode,
                                     String courseNumber)
        {
            search.setTermYear(termYear);
            search.setSubjectCode(subjectCode);
            search.setCourseNumber(courseNumber);
            networkHandler.searchTimetable(search);
            String rawData = networkHandler.getTimetableResults();
            dataHandler.setPreprocessedData(rawData);
            dataHandler.processData();
            List<Section> sections = dataHandler.getSections();

            return sections;
        }
}
