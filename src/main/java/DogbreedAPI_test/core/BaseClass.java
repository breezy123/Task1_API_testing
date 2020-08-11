package DogbreedAPI_test.core;

public class BaseClass {

    private static String _reportDirectory;
    public static void setReportDirectory(String directory){_reportDirectory = directory;}
    public static String getReportDirectory(){return _reportDirectory;}

    public static String testName;

    public static boolean EnableScreenshots;
}
