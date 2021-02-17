
# README

### Api Testing Framework based on Serenity-BDD with Cucumber4 flavour build on top of Rest Assured Library.


Weather Report API have been used to automate with serenity bdd with cucumber4 build on top of Rest Assured Framework.


###Pre-Requisites:

- JAVA8 or above

- Maven3 or above

- IDE - Eclipse/IntelliJ



###Installation:

- git clone project

- import as maven project in your respective IDE


###RUN TESTS:

mvn verify -Denvironment=dev/stage/test

 Note:
  For now all env has been populated with same value, properties can be added in /src/resources/serenity.conf file for each environment
 
 
 ### Test Data:

Test data has been defined in feature files which are processed with corresponding json templates defined in resources/templates


## Test Report
Test report is generated at /Project Directory/target/site/serenity/


