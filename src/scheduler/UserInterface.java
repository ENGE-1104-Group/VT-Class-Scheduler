package scheduler;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

    /**
     * Handles the user input and calls the necessary methods
     */
    public void handleInput(String input)
    {

    }
}
