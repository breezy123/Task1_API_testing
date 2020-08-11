package DogbreedAPI_test;

import DogbreedAPI_test.core.BaseClass;
import DogbreedAPI_test.entities.DataRow;
import DogbreedAPI_test.testing.testclasses.GetRequest;
import DogbreedAPI_test.tools.ExcelReaderUtility;
import DogbreedAPI_test.tools.Reporting;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ListAllDogsTestSuite extends BaseClass
{
    @Test
    public  void  testListAllDogs(){

        testName = "testListAllDogs";
        Reporting.createTest();

        DataRow testData = ExcelReaderUtility.GetFirstTestDataRow("C:\\DogbreedAPI-automation-test\\testData\\ListAllDogs_one.xlsx");
        boolean testResult = true;

        testResult = GetRequest.ExecuteTestClass(testData);
        Assert.assertTrue(testResult);
    }
}
