# README #

This README documents the sample test for
1. Go to site http://www.expedia.com (=>changed this to http://www.expedia.ie as Euro was listed later)
2. Select "Flights"
3. Type London in "Fly from: city or airport"
4. Select Heathrow in popup
5. Type Dublin in "Flying to: city or airport"
6. Select "Dublin Airport (DUB), Ireland" in popup
7. Select Departing: 01/11/2017 (=>changed this to 01/11/2018 as couldn't pick a date in the past)
8. Select Departing: 07/11/2017 (=>changed this to 07/11/2018 as couldn't pick a date in the past)
9. Pick Adult: 2
10. Click Search Button
11. Wait for all flights to be loaded. Find first row excluding the promotional row for “Flight +
Hotel”
12. Assert Positive scenario that the price in first row is €84 .92 (or any other price at your time)
13. Assert Negative scenario that the price in first row is not €0.92
14. Assert the visible left panel list of “Airlines included” below the list of “Stops”
15. Scroll to the bottom of the page and assert the visibility of text “© 2017 Expedia, Inc. All rights
reserved.” (=> changed this to “© 2018 Expedia...)

To run
1. Download and Open in Eclipse (or your preferred Java IDE).
2. Install Java 1.7 and add to the project build path. (Please compile against Java 1.7 also)
3. Run the pom.xml (as a maven test)


Supported Browsers are Firefox & Chrome
To switch between these browsers, uncomment one of the following (see => src/main/java/resources/testprojectProperties.properties)
     browser=Firefox
     browser=Chrome
 
Please Note:
There are some additional refactoring/improvement of code that could be made (for example) 
- Extract out the hardcoded Strings
- Have a class around the Date Time Picker which you can use to pick dates by passing variables
- I am hitting the http://www.expedia.ie which detects the Date/Time in a particular format. This should be formated using 'Calendar' depending on local
- Likewise for the format of the currency (€)
- Common Tasks could be created for repeated tasks.... filling in flight details, as an example.

Please contact lisahhenry@gmail.com for any issues.




