Feature: Create Leads in leaftaps

@smoke @regression
Scenario Outline: Create Leads in leaftaps - positive

Given enter the username as <uName>
And enter the password as <pwd>
And click on login
And click on crm/sfa
And click on Leads
And click on Create Leads
And enter Company Name as <cName>
And enter the First Name as <fName>
And enter the Last Name as <lName>
And enter the phone number as <pNum>
When click on Create Lead Button
Then Verify Lead is successfully created for <fName>


Examples:
|uName|pwd|fName|lName|cName|pNum|
|DemoSalesManager|crmsfa|Sathish|Kannan|TGS|741852963|
|DemoSalesManager|crmsfa|Sankar|Kadhirvelan|CTS|741852963|