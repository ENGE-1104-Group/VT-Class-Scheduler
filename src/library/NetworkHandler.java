package library;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.net.URLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * // -------------------------------------------------------------------------
/**
 *  This class is for handling all the Network Handling operations for the
 *  library.  It will interface with the timetable and return the un-processed
 *  data.
 *
 *  @author cmbuck
 *  @version Apr 4, 2012
 */
public class NetworkHandler
{

    private String timetableURL;
    private String timetableResults;

    /**
     * Creates a new NetworkHandler object that will use the specified URL
     * for the timetable of classes
     * @param URL The URL of the Timetable of Classes
     */
    public NetworkHandler(String URL)
    {
        this();
        setURL(URL);
    }

    /**
     * Creates a new NetworkHandler object.  This NetworkHandler will not have
     * the URL of the timetable of classes defined.
     */
    public NetworkHandler()
    {
        //Nothing to do in here yet
    }

    /**
     * Sets the URL for this NetworkHandler object
     * @param URL The URL to use
     */
    private void setURL(String URL)
    {
        timetableURL = URL;
    }

    /**
     * Generates the HTTP Post Data String for searching the specified
     * information in the Timetable.
     * @param search The Search object containing the specified parameters
     * @return The generated Post Data string
     */
    public String generatePostDataString(Search search)
    {
        String data = null;
        try
        {
            data = "";

            data += URLEncoder.encode("CAMPUS", "UTF-8")
                + "=" + URLEncoder.encode(search.getCampus(), "UTF-8");

            data += "&" + URLEncoder.encode("TERMYEAR", "UTF-8")
                + "=" + URLEncoder.encode(search.getTermYear(), "UTF-8");

            data += "&" + URLEncoder.encode("CORE_CODE", "UTF-8")
                + "=" + URLEncoder.encode(search.getCoreCode(), "UTF-8");

            data += "&" + URLEncoder.encode("SUBJ_CODE", "UTF-8")
                + "=" + URLEncoder.encode(search.getSubjectCode(), "UTF-8");

            data += "&" + URLEncoder.encode("SCHDTYPE", "UTF-8")
                + "=" + URLEncoder.encode(search.getScheduleType(), "UTF-8");

            data += "&" + URLEncoder.encode("CRSE_NUMBER", "UTF-8")
                + "=" + URLEncoder.encode(search.getCourseNumber(), "UTF-8");

            data += "&" + URLEncoder.encode("crn", "UTF-8") + "="
                + URLEncoder.encode(search.getCrn(), "UTF-8");

            data += "&" + URLEncoder.encode("open_only", "UTF-8")
                + "=" + URLEncoder.encode(search.getOpenOnly(), "UTF-8");

            data += "&" + URLEncoder.encode("BTN_PRESSED", "UTF-8")
                + "=" + URLEncoder.encode(search.getButtonPressed(), "UTF-8");

            data += "&" + URLEncoder.encode("inst_name", "UTF-8")
                + "=" + URLEncoder.encode(search.getInstanceName(), "UTF-8");
        }
        catch (UnsupportedEncodingException e)
        {
            System.err.println("ERROR: UnsupportedEncodingException " +
            		"occured when trying to generate Post Data string");
        }

        return data;
    }

    /**
     * Searches the Timetable of classes with the parameters specified in the
     * supplied Search object.  Stores the result in the timetableResults
     * private variable.
     * @param search The parameters for this search
     */
    public void searchTimetable(Search search)
    {
        if (timetableURL == null)
        {
            System.err.println("ERROR: Timetable URL is null");
            timetableResults = null;
            return;
        }

        String postDataString = generatePostDataString(search);
        String result = null;

        try
        {
            //Open connection to the Timetable
            URL url = new URL(timetableURL);
            URLConnection connection = url.openConnection();
            connection.setDoOutput(true);

            //Send the POST Data to the Timetable
            OutputStreamWriter writer =
                    new OutputStreamWriter(connection.getOutputStream());
            writer.write(postDataString);
            writer.flush();

            //Read the Timetable data
            //using the BufferedReader readline method
            BufferedReader reader =
                    new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));
            String line = null;

            while ((line = reader.readLine()) != null) {
                result += line;  //add each line to the 'result' string
            }

            //Close open streams
            writer.close();
            reader.close();

        }
        catch (MalformedURLException e)
        {
            System.err.println("ERROR: MalformedURLException ocurred " +
                "when trying to open a connection to the Timetable");
        }
        catch (IOException e)
        {
            System.err.println("ERROR: IOException ocurred when trying to " +
            		"connect to, output to, or read from the Timetable URL");
        }

        timetableResults = result;
    }

    /**
     * Gets the results of the last Timetable search.
     * @return The results of the last search; null if there was an error
     */
    public String getTimetableResults()
    {
        return timetableResults;
    }
}
