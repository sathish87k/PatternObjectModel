Feature: Edit Leads in leaftaps

Scenario Outline: Edit Leads in leaftaps - positive

Given enter the username as <uName>
And enter the password as <pwd>
And click on login
And click on crm/sfa
And click on Leads
And click on Merge Leads
And click on From Lead lookup
And enter the Lead ID in the Lead lookup as <fLeadId>
And click on Find Button in the Lookup
And click on First record in the Lookup result
And click on To Lead lookup
And enter the Lead ID in the Lead lookup as <tLeadId>
And click on Find Button in the Lookup
And click on First record in the Lookup result
When click on Merge Button and accept the Alert message
And click on Find Leads
And enter the Lead id to search for as <fLeadId>
And click on Find Lead Button
Then Verify that the Lead ID is not available


Examples:
|uName|pwd|fLeadId|tLeadId|
|DemoSalesManager|crmsfa|11560|11584|
|DemoSalesManager|crmsfa|11590|11593|