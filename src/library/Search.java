package library;

import java.net.URLEncoder;

/**
 * // -------------------------------------------------------------------------
/**
 *  The Search class is intended to hold the parameters necessary for each
 *  search on the Timetable
 *
 *  @author cmbuck
 *  @version Apr 4, 2012
 */
public class Search
{
    private String campus;
    private String termYear;
    private String coreCode;
    private String subjectCode;
    private String scheduleType;
    private String courseNumber;
    private String crn;
    private String openOnly;
    private String buttonPressed;
    private String instanceName;

    /**
     * Sets the parameters to be their default values to work for most uses
     */
    public void setDefaults()
    {
        //these values may seem funny, but some of them are required to be that
        //way to get any results
        campus = "0";
        termYear = "";
        coreCode = "AR%";
        subjectCode = "";
        scheduleType = "%";
        courseNumber = "";
        crn = "";
        openOnly = "";
        buttonPressed = "FIND+class+sections";
        instanceName = "";
    }

    /**
     * @return the campus
     */
    public String getCampus()
    {
        return campus;
    }

    /**
     * @return the termYear
     */
    public String getTermYear()
    {
        return termYear;
    }

    /**
     * @return the coreCode
     */
    public String getCoreCode()
    {
        return coreCode;
    }

    /**
     * @return the subjectCode
     */
    public String getSubjectCode()
    {
        return subjectCode;
    }

    /**
     * @return the scheduleType
     */
    public String getScheduleType()
    {
        return scheduleType;
    }

    /**
     * @return the courseNumber
     */
    public String getCourseNumber()
    {
        return courseNumber;
    }

    /**
     * @return the crn
     */
    public String getCrn()
    {
        return crn;
    }

    /**
     * @return the openOnly
     */
    public String getOpenOnly()
    {
        return openOnly;
    }

    /**
     * @return the buttonPressed
     */
    public String getButtonPressed()
    {
        return buttonPressed;
    }

    /**
     * @return the instanceName
     */
    public String getInstanceName()
    {
        return instanceName;
    }

    /**
     * @param campus the campus to set
     */
    public void setCampus(String campus)
    {
        this.campus = campus;
    }

    /**
     * @param coreCode the coreCode to set
     */
    public void setCoreCode(String coreCode)
    {
        this.coreCode = coreCode;
    }

    /**
     * @param scheduleType the scheduleType to set
     */
    public void setScheduleType(String scheduleType)
    {
        this.scheduleType = scheduleType;
    }

    /**
     * @param crn the crn to set
     */
    public void setCrn(String crn)
    {
        this.crn = crn;
    }

    /**
     * @param openOnly the openOnly to set
     */
    public void setOpenOnly(String openOnly)
    {
        this.openOnly = openOnly;
    }

    /**
     * @param buttonPressed the buttonPressed to set
     */
    public void setButtonPressed(String buttonPressed)
    {
        this.buttonPressed = buttonPressed;
    }

    /**
     * @param instanceName the instanceName to set
     */
    public void setInstanceName(String instanceName)
    {
        this.instanceName = instanceName;
    }

    /**
     * Sets the Term Year
     * @param termYear The value of term year to set
     */
    public void setTermYear(String termYear)
    {
        this.termYear = termYear;
    }

    /**
     * Sets the Subject Code
     * @param subjectCode The value of the subject code to set
     */
    public void setSubjectCode(String subjectCode)
    {
        this.subjectCode = subjectCode;
    }

    /**
     * Sets the Course Number
     * @param courseNumber The value of the course number to set
     */
    public void setCourseNumber(String courseNumber)
    {
        this.courseNumber = courseNumber;
    }


}
