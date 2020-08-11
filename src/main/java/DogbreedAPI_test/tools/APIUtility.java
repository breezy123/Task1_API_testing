package DogbreedAPI_test.tools;

import DogbreedAPI_test.entities.DataRow;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class APIUtility {

    public static URL url;
    public static HttpURLConnection conn;


    public static int GetResponseStatus(String urlRequest, String requestType, DataRow testData)
    {
        try
        {
            url = new URL(urlRequest);

            conn = (HttpURLConnection)url.openConnection();

            conn.setRequestMethod(requestType);

            conn.connect();

            int responseStatus = conn.getResponseCode();

            return responseStatus;
        }
        catch(Exception ex)
        {
            System.out.print("[ERROR]. Failed to process Get Request Status");
            return 0;
        }
    }

    public static String JsonText()
    {
        try
        {
            String inline ="";
            Scanner sc = new Scanner(url.openStream());

            while(sc.hasNext())
            {
                inline+=sc.nextLine();
            }

            sc.close();
            return inline;
        }
        catch(Exception ex)
        {
            return null;
        }
    }

}
