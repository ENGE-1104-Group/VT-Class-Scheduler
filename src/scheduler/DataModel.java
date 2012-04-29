package scheduler;

import java.util.Set;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import library.Section;

/**
 * // -------------------------------------------------------------------------
/**
 *  The DataModel class is for storing all the data for the scheduler
 *
 *  @author cmbuck
 *  @version Apr 28, 2012
 */
public class DataModel
{
    Map<String, List<Section>> dataModel;

    /**
     * Constructs a new DataModel object
     */
    public DataModel()
    {
        dataModel = new HashMap<String, List<Section>>();
    }

    /**
     * Add a list of sections to the data model
     * @param course the string of the course name and number
     * @param sections the list of sections returned from the timetable
     */
    public void addCourseSections(String course, List<Section> sections)
    {
        dataModel.put(course, sections);
    }

    /**
     * gets whether the data model is empty
     * @return whether the Map is empty
     */
    public boolean isEmpty()
    {
        return dataModel.isEmpty();
    }

    /**
     * Gets the set of courses stored in the data model
     * @return the set of course Strings
     */
    public Set<String> getCourseSet()
    {
        return dataModel.keySet();
    }

    /**
     * Gets the List of Sections stored for a particular course
     * @param course the course
     * @return the list of sections
     */
    public List<Section> getSections(String course)
    {
        return dataModel.get(course);
    }
}
