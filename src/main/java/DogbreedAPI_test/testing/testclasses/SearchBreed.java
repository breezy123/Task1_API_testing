package DogbreedAPI_test.testing.testclasses;

import DogbreedAPI_test.entities.DataRow;
import DogbreedAPI_test.tools.Reporting;

import static DogbreedAPI_test.tools.APIUtility.GetResponseStatus;
import static DogbreedAPI_test.tools.APIUtility.JsonText;


public class SearchBreed {

    public static boolean ExecuteTestClass(DataRow testRow)
    {
        try
        {
            if(!BreedType(testRow.getColumnValue("URL Request").toString(),testRow.getColumnValue("Request Type").toString(),testRow))
            {
                return false;
            }

            Reporting.finaliseTest();
            return true;
        }
        catch (Exception ex)
        {
            System.err.println("[ERROR]: Failed to execute the  Request  Search Breed test class. "+ex.getMessage());
            return false;
        }
    }

    public static boolean BreedType(String urlRequest, String requestType, DataRow testData)
    {

        int responseCode = GetResponseStatus(urlRequest,requestType,testData);

        if(responseCode!=200)
        {
            Reporting.testFailed("Status Code: "+responseCode);
            return false;
        }
        else
        {
            Reporting.stepPassed(JsonText());
            if(JsonText().contains(testData.getColumnValue("Breed Type").toString()))
            {
                Reporting.stepPassed("Verify - "+testData.getColumnValue("Breed Type").toString()+" is within list.");
                Reporting.stepPassed("Status Code: "+responseCode);
                return true;
            }
            else
            {
                Reporting.stepPassed("Verify - "+testData.getColumnValue("Breed Type").toString()+" is NOT within list.");
                return false;
            }

        }
    }
}
