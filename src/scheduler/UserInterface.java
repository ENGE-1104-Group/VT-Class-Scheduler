package scheduler;

import library.Section;
import java.util.List;
import java.util.Scanner;
import library.TimetableLibrary;

/**
 * // -------------------------------------------------------------------------
/**
 *  Contains all the code to handle displaying messages to the user and getting
 *  the user's responses.
 *
 *  @author cmbuck
 *  @version Apr 28, 2012
 */
public class UserInterface
{
    private final String message = "Enter a menu choice";
    private final String[] mainMenu = { "Search" +
                                        "Display" +
                                        "Exit"};
    private Scanner scanner;
    private TimetableLibrary library;
    private DataModel dataModel;
    private boolean exit = false;

    /**
     * Constructor for UserInterface
     * @param lib The TimetableLibrary reference
     */
    public UserInterface(TimetableLibrary lib, DataModel dm)
    {
        scanner = new Scanner(System.in);
        library = lib;
        dataModel = dm;
    }

    /**
     * Returns whether the user specified the program should exit
     * @return whether the program should exit
     */
    public boolean shouldExit()
    {
        return exit;
    }

    /**
     * Displays the main menu of options to the user
     */
    public void displayMenu()
    {

    }

    /**
     * Gets the user input and returns it as a string
     * @return the string of user input
     */
    public String getUserInput()
    {
        System.out.print("> ");
        String str = scanner.nextLine();
        return str;
    }

    /**
     * Handles the user input and calls the necessary methods
     */
    public void handleInput(String input)
    {
        if (input.equalsIgnoreCase("exit"))
        {
            //exit
            exit = true;
        }
        else if (input.equalsIgnoreCase("search"))
        {
            //search
            handleSearch();
        }
        else if (input.equalsIgnoreCase("display"))
        {
            //display
            handleDisplay();
        }
    }


    private void handleSearch()
    {
        //Prompt user
        System.out.println("\n--Searching Timetable--");
        System.out.println("Enter term [in the format YYYYTT]");
        System.out.println("Spring=01, Summer I=06, Summer II=07, Fall=09");
        System.out.println("For example, Fall 2012 is: 201209");
        String termYear = getUserInput();   //TODO: Sanitize
        System.out.println("Enter course subject code. (Ex. PHYS, MATH)");
        String subjectCode = getUserInput();    //TODO: Sanitize
        System.out.println(
            "Enter course number (Do not append 'H' for honors sections)");
        String courseNumber = getUserInput();   //TODO: Sanitize

        List<Section> sections =
            library.getSections(termYear, subjectCode, courseNumber);

        dataModel.addCourseSections(subjectCode + "-" + courseNumber, sections);

        System.out.println("Returned sections: " + sections.size() + "\n");
    }


    private void handleDisplay()
    {
        //prompt user
        System.out.println("\n--Display Course Sections--");
        if (dataModel.isEmpty())
        {
            System.out.println("No courses stored. Nothing to display.");
            return;
        }
        System.out.println("Stored courses:");
        for (String str : dataModel.getCourseSet())
        {
            System.out.println(str);
        }
        System.out.println();
        System.out.println("Specify which course to display, or enter \"ALL\"");
        String input = getUserInput();  //TODO: Sanitize
        if (input.equalsIgnoreCase("ALL"))
        {
            for (String str : dataModel.getCourseSet())
                printSections(dataModel.getSections(str));
        }
        else
        {
            printSections(dataModel.getSections(input));
        }
    }

    /**
     * Prints a list of Sections prettily
     * @param sections the list of sections to print
     */
    private void printSections(List<Section> sections)
    {
        for (Section s : sections)
        {
            System.out.println(s.getCourse() + " : " + s.getInstructor() +
                ", " + s.getDays() + ", " + s.getBegin() + " - " + s.getEnd() +
                ", " + s.getExam());
        }
    }
}
