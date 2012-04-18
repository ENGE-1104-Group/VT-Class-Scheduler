package library;

import java.util.ArrayList;

/**
 * // -------------------------------------------------------------------------
/**
 *  The Section class is for storing each class section listed in the timetable
 *  as an object.  The data from the timetable will be parsed and stored as
 *  these objects.
 *
 *  @author cmbuck
 *  @version Apr 11, 2012
 */
public class Section
{

    private int crn;
    private String course;
    private String title;
    private String type;
    private int hrs;
    private String capacity;
    private String instructor;
    private ArrayList<Day> days;
    private Time begin;
    private Time end;
    private String location;
    private String exam;
    private ArrayList<AdditionalTime> additionalTimes;


    // ----------------------------------------------------------
    /**
     * @return the crn
     */
    public int getCrn()
    {
        return crn;
    }


    // ----------------------------------------------------------
    /**
     * @return the course
     */
    public String getCourse()
    {
        return course;
    }


    // ----------------------------------------------------------
    /**
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }


    // ----------------------------------------------------------
    /**
     * @return the type
     */
    public String getType()
    {
        return type;
    }


    // ----------------------------------------------------------
    /**
     * @return the hrs
     */
    public int getHrs()
    {
        return hrs;
    }


    // ----------------------------------------------------------
    /**
     * @return the capacity
     */
    public String getCapacity()
    {
        return capacity;
    }


    // ----------------------------------------------------------
    /**
     * @return the instructor
     */
    public String getInstructor()
    {
        return instructor;
    }


    // ----------------------------------------------------------
    /**
     * @return the days
     */
    public ArrayList<Day> getDays()
    {
        return days;
    }


    // ----------------------------------------------------------
    /**
     * @return the begin
     */
    public Time getBegin()
    {
        return begin;
    }


    // ----------------------------------------------------------
    /**
     * @return the end
     */
    public Time getEnd()
    {
        return end;
    }


    // ----------------------------------------------------------
    /**
     * @return the location
     */
    public String getLocation()
    {
        return location;
    }


    // ----------------------------------------------------------
    /**
     * @return the exam
     */
    public String getExam()
    {
        return exam;
    }


    // ----------------------------------------------------------
    /**
     * @return the additionalTimes
     */
    public ArrayList<AdditionalTime> getAdditionalTimes()
    {
        return additionalTimes;
    }


    // ----------------------------------------------------------
    /**
     * @param crn the crn to set
     */
    public void setCrn(int crn)
    {
        this.crn = crn;
    }


    // ----------------------------------------------------------
    /**
     * @param course the course to set
     */
    public void setCourse(String course)
    {
        this.course = course;
    }


    // ----------------------------------------------------------
    /**
     * @param title the title to set
     */
    public void setTitle(String title)
    {
        this.title = title;
    }


    // ----------------------------------------------------------
    /**
     * @param type the type to set
     */
    public void setType(String type)
    {
        this.type = type;
    }


    // ----------------------------------------------------------
    /**
     * @param hrs the hrs to set
     */
    public void setHrs(int hrs)
    {
        this.hrs = hrs;
    }


    // ----------------------------------------------------------
    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(String capacity)
    {
        this.capacity = capacity;
    }


    // ----------------------------------------------------------
    /**
     * @param instructor the instructor to set
     */
    public void setInstructor(String instructor)
    {
        this.instructor = instructor;
    }


    // ----------------------------------------------------------
    /**
     * @param days the days to set
     */
    public void setDays(ArrayList<Day> days)
    {
        this.days = days;
    }

    /**
     * @param day the day to add
     */
    public void addDay(Day day)
    {
        days.add(day);
    }


    // ----------------------------------------------------------
    /**
     * @param begin the begin to set
     */
    public void setBegin(Time begin)
    {
        this.begin = begin;
    }


    // ----------------------------------------------------------
    /**
     * @param end the end to set
     */
    public void setEnd(Time end)
    {
        this.end = end;
    }


    // ----------------------------------------------------------
    /**
     * @param location the location to set
     */
    public void setLocation(String location)
    {
        this.location = location;
    }


    // ----------------------------------------------------------
    /**
     * @param exam the exam to set
     */
    public void setExam(String exam)
    {
        this.exam = exam;
    }


 // ----------------------------------------------------------
    /**
     * @param additionalTimes the additionalTimes to set
     */
    public void setAdditionalTimes(ArrayList<AdditionalTime> additionalTimes)
    {
        this.additionalTimes = additionalTimes;
    }

 // ----------------------------------------------------------
    /**
     * Add a new AdditionalTime to this Section
     * @return a reference to the newly added AdditionalTime
     */
    public AdditionalTime addAdditionalTime()
    {
        AdditionalTime temp = new AdditionalTime();
        additionalTimes.add(temp);
        return temp;
    }


    // -------------------------------------------------------------------------
    /**
     *  This sub-class is for storing information for Sections that have
     *  "Additional Times" listed in the timetable
     *
     *  @author cmbuck
     *  @version Apr 11, 2012
     */
    public class AdditionalTime extends Section
    {
        private ArrayList<Day> additionalDays;
        private Time additionalBegin;
        private Time additionalEnd;
        private String additionalLocation;


        // ----------------------------------------------------------
        /**
         * @return the days
         */
        public ArrayList<Day> getDays()
        {
            return additionalDays;
        }
        // ----------------------------------------------------------
        /**
         * @return the start
         */
        public Time getStart()
        {
            return additionalBegin;
        }
        // ----------------------------------------------------------
        /**
         * @return the end
         */
        public Time getEnd()
        {
            return additionalEnd;
        }
        // ----------------------------------------------------------
        /**
         * @return the location
         */
        public String getLocation()
        {
            return additionalLocation;
        }
        // ----------------------------------------------------------
        /**
         * @param days the days to set
         */
        public void setDays(ArrayList<Day> days)
        {
            this.additionalDays = days;
        }
        /**
         * @param day the day to add
         */
        public void addDay(Day day)
        {
            additionalDays.add(day);
        }
        // ----------------------------------------------------------
        /**
         * @param start the start to set
         */
        public void setStart(Time start)
        {
            this.additionalBegin = start;
        }
        // ----------------------------------------------------------
        /**
         * @param end the end to set
         */
        public void setEnd(Time end)
        {
            this.additionalEnd = end;
        }
        // ----------------------------------------------------------
        /**
         * @param location the location to set
         */
        public void setLocation(String location)
        {
            this.additionalLocation = location;
        }
    }

}
