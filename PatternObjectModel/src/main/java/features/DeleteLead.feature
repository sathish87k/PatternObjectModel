Feature: Edit Leads in leaftaps

Scenario Outline: Edit Leads in leaftaps - positive

Given enter the username as <uName>
And enter the password as <pwd>
And click on login
And click on crm/sfa
And click on Leads
And click on Find Leads
And click on Phone tab
And enter the Phone number to search for as <pNum>
And click on Find Lead Button
And click on First resulting record
When click on Delete Button
And click on Find Leads
And enter the id of the deleted Lead
And click on Find Lead Button
Then Verify that the Lead ID is not available


Examples:
|uName|pwd|pNum|
|DemoSalesManager|crmsfa|741852963|