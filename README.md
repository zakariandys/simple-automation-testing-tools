This project has build with : Java, MySQL, Selenium web driver, TestNG, IntellijIDEA as IDE


Clone this repository
```
https://github.com/zakariandys/simple-automation-testing-tools.git
```

Compile and install dependencies
```
mvn clean install
```

Change database configuration on package `com.automation.database`

Run test

The sample result if error occured
```
Starting ChromeDriver 2.32.498513 (2c63aa53b2c658de596ed550eb5267ec5967b351) on port 16712
Only local connections are allowed.
Oct 28, 2017 5:32:40 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Attempting bi-dialect session, assuming Postel's Law holds true on the remote end
Oct 28, 2017 5:32:55 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
[TestNG] Running:
  /home/zakariandys/.IdeaIC2016.3/system/temp-testng-customsuite.xml
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
7

java.lang.AssertionError: The following asserts failed:
	expected [01023A9AA] but found [01023A9AC],
	expected [JNE] but found [REX],
	expected [KAMPUNG DATOK KERAMAT] but found [JALAN GURNEY],
	expected [01023A9AA] but found [01023A9AD],
	expected [JNE] but found [POS],
	expected [KAMPUNG DATOK KERAMAT] but found [UTM KUALA LUMPUR],
	expected [01023A9AA] but found [01023A9AL],
	expected [FURHAN] but found [ZAKA],
	expected [2016-08-21] but found [2016-08-22],
	expected [KAMPUNG DATOK KERAMAT] but found [JAKARTA],
	expected [01023A9AA] but found [01023A9AT],
	expected [JNE] but found [POS],
	expected [2016-08-21] but found [2016-08-25],
	expected [KAMPUNG DATOK KERAMAT] but found [JAKARTA],
	expected [01023A9AA] but found [01023A9AY],
	expected [FURHAN] but found [BOBI],
	expected [JNE] but found [TIKI],
	expected [2016-08-21] but found [2016-08-24],
	expected [KAMPUNG DATOK KERAMAT] but found [JAKARTA],
	expected [01023A9AA] but found [01023A9AZ],
	expected [FURHAN] but found [VIKA],
	expected [JNE] but found [POS],
	expected [2016-08-21] but found [2016-08-23],
	expected [KAMPUNG DATOK KERAMAT] but found [BANDUNG]
Expected :KAMPUNG DATOK KERAMAT
Actual   :BANDUNG
 <Click to see difference>

===============================================
Default Suite
Total tests run: 1, Failures: 1, Skips: 0
===============================================


Process finished with exit code 0
```
