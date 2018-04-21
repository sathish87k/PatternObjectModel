Feature: Create new leads using Duplicate option in leaftaps

@smoke
Scenario Outline: Create new leads using Duplicate option in leaftaps - positive

Given enter the username as <uName>
And enter the password as <pwd>
And click on login
And click on crm/sfa
And click on Leads
And click on Find Leads
And enter the First Name to search for as <fName>
And click on Find Lead Button
And click on First resulting record
When click on Duplicate Lead Button
And change the company name for the duplicate lead to <cName>
And click on the create lead button in Duplicate lead page
Then Verify Lead company name is <cName>
And Verify Lead Id is not the id selected to be duplicated


Examples:
|uName|pwd|fName|cName|
|DemoSalesManager|crmsfa|Sathish|TGS|
|DemoSalesManager|crmsfa|Sankar|CG|




