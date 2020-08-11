package DogbreedAPI_test;

import DogbreedAPI_test.core.BaseClass;
import DogbreedAPI_test.entities.DataRow;
import DogbreedAPI_test.testing.testclasses.SearchBreed;
import DogbreedAPI_test.tools.ExcelReaderUtility;
import DogbreedAPI_test.tools.Reporting;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchBreedTestSuite extends BaseClass
{
    @Test
    public  void  testSearchBreed(){

        testName = "testSearchBreed";
        Reporting.createTest();

        DataRow testData = ExcelReaderUtility.GetFirstTestDataRow("C:\\DogbreedAPI-automation-test\\testData\\SearchBreed_one.xlsx");
        boolean testResult = true;

        testResult = SearchBreed.ExecuteTestClass(testData);
        Assert.assertTrue(testResult);
    }
}
