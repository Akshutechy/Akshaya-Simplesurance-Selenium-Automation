# Simplesurance-Selenium-Assignment

This repository holds the Selenium - Java - TestNg Automation tests as part of the assignment of Simplesurance organization for the role of Test Automation Engineer.

Automated following scenarios of the Insurance Manager(https://insurance-manager.sb-qa-candidatetask.sisu.sh/login) website

- Create a single Insurance Policy
- Create batch/multiple Insurance Policy using provided CSV file
- Verify Filtering the Insurance List page
- Verify Sorting the Insurance List page

## TechStack
- Selenium
- Java
- TestNg
- Maven
- Extent Report
- Webdriver Manager

Following are the topics covered in this framework
- Maven Folder Structure
- Base Test and Base Page
- Thread-Safety Mechanism
- Property-File Handling
- Static Block
- Page Object Model
- Chaining in Page Object Model
- Handling Enums
- Factory Class(DriverFactory, ExplicitWaitFactory)
- Extent Report - 5.0 Integration
- Extent Logger
- Cross Browser testing
- Exception Handling

## Installing Dependencies

- Clone the repository using Git and save it in the local machine
- Open the cloned repository in any IDE(Preferable Intellij)
- On the right pane click on the Maven symbol --> Lifecycle --> install. This will install all the dependencies mentioned in the pom.xml

## Running Test Locally

- Right-click on the testng.xml file and click on "...\testng.xml" button
- It will execute all the test mentioned in the xml in parallel mode with 2 browser instances
- Once the test completes it will automatically open the Extent Report in the default browser

## Configuring properties
- In the project under src/test/resources/config there is a file called as config.properties. This file holds the major configuration.
- It holds the URL, Login email and password credentials
- It contains a configuration to decide which browser to run -> Chrome or Firefox
- It also handles if the screenshot need to be attached in the Extent Report for the passed and skipped step
- It also provides way to maintain report history. If overridereports = yes older reports will be deleted. If overridereports = no then it will save the report file with Current Date and Time