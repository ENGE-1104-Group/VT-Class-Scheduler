package scheduler;

import java.util.List;
import library.TimetableLibrary;
import library.Section;

public class Scratch
{
    static String timetableURL =
        "https://banweb.banner.vt.edu/ssb/prod/HZSKVTSC.P_ProcRequest";

    public static void main(String [] args)
    {
        TimetableLibrary tl = new TimetableLibrary(timetableURL);

        List<Section> sections;

        sections = tl.getSections("201201", "MATH", "");

        System.out.println(sections.size());
        for (Section s : sections)
        {
            System.out.println(s.getCourse() + " : " + s.getInstructor() +
                ", " + s.getDays() + ", " + s.getBegin() + " - " + s.getEnd() +
                ", " + s.getExam());
        }
    }
}
