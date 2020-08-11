package DogbreedAPI_test.testing.testclasses;

import DogbreedAPI_test.entities.DataRow;
import DogbreedAPI_test.tools.Reporting;

import static DogbreedAPI_test.tools.APIUtility.GetResponseStatus;
import static DogbreedAPI_test.tools.APIUtility.JsonText;


public class GetRequest {

    //public static int responseCode =0;

    public static boolean ExecuteTestClass(DataRow testRow)
    {
        try
        {
            if(!ListAllDogs(testRow.getColumnValue("URL Request").toString(),testRow.getColumnValue("Request Type").toString(),testRow))
            {
                return false;
            }

            Reporting.finaliseTest();
            return true;
        }
        catch (Exception ex)
        {
            System.err.println("[ERROR]: Failed to execute the  Request  List All Dogs test class. "+ex.getMessage());
            return false;
        }
    }

    public static boolean ListAllDogs(String urlRequest, String requestType, DataRow testData)
    {
                int responseCode = GetResponseStatus(urlRequest,requestType,testData);

                if(responseCode!=200)
                {
                    Reporting.testFailed("Status Code: "+responseCode);
                    return false;
                }
                else
                {
                    Reporting.stepPassed("Status Code: "+responseCode);
                    Reporting.stepPassed(JsonText());
                    return true;
                }
    }

}
