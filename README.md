
This project is similar to the Selenium project, however here Selenium Web driver and the test Action classes are removed. I added “APIUtility” class, this class takes parameters “URL Request and “Request Type” executes and returns the actual JSON text and response status code. If the expected status code “200” is not returned the test fails.

Please follow the steps below:

1.	Clone the repository to your machine (C:\) drive
2.	Download and install IntelliJ IDE Community 2019 https://www.jetbrains.com/idea/download/other.html
3.	Install IntelliJ IDE
4.	Open the cloned project via IntelliJ IDE
5.	Let IDE auto download dependencies 
6.	Navigate to package “test”-> “java”->” DogbreedAPI_test”.
7.	There’re four classes named “ListAllDogsTestSuite.java” is one of the classes 
8.	Right click on either and select “ListAllDogsTestSuite.java”, this will therefor execute the test.
9.	When you have executed the tests, open the project on C:\ driver
10.	Open the “Report” folder, continue open the sub-folders until you reach “extentReport.html” file, and open this .html file.
11.	Test report presented.
