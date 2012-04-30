package scheduler;

import library.TimetableLibrary;

public class Scheduler
{

    static String timetableURL =
        "https://banweb.banner.vt.edu/ssb/prod/HZSKVTSC.P_ProcRequest";

    public static void main(String [] args)
    {
        DataModel dataModel = new DataModel();
        TimetableLibrary timetableLibrary = new TimetableLibrary(timetableURL);
        UserInterface ui = new UserInterface(timetableLibrary, dataModel);

        String input;
        while (!ui.shouldExit())
        {
            ui.displayMenu();
            input = ui.getUserInput();
            ui.handleInput(input);
        }
    }
}
