Feature: Edit Leads in leaftaps

@smoke
Scenario Outline: Edit Leads in leaftaps - positive

Given enter the username as <uName>
And enter the password as <pwd>
And click on login
And click on crm/sfa
And click on Leads
And click on Find Leads
And enter the First Name to search for as <fName>
And click on Find Lead Button
And click on First resulting record
When click on Edit Button
And change the company name to <cName>
And click on update button 
Then Verify Lead company name is <cName>


Examples:
|uName|pwd|fName|cName|
|DemoSalesManager|crmsfa|Sathish|TGS|
|DemoSalesManager|crmsfa|Sankar|CG|