Feature: Login to Leaptaps 

Background: 
	Given Launch the chrome browser 
	And Load the URL and maximize 
	
Scenario Outline: create Lead with manadatory details 
	When Enter Username as <username> 
	And Enter Password as <password> 
	And Click on Login 
	And Click on CRMSFA 
	#And Click on Leads
	#And Click on Create Leads link
	#When Enter Company Name as 'TestLeaf'
	#And Enter First Name as <FirstName>
	#And Enter Last Name as 'J'
	#And Click on Create Leads button
	#Then Verify First Name is displayed as <FirstName>
	
	Examples: 
		|username|password|
		|DemoSalesManager|crmsfa|
		|DemoCSR|crmsfa|
		
Scenario Outline: create Lead with manadatory details 
	When Enter Username as <username> 
	And Enter Password as <password> 
	And Click on Login 
	And Click on CRMSFA 
	#And Click on Leads
	#And Click on Create Leads link
	#When Enter Company Name as 'TestLeaf'
	#And Enter First Name as <FirstName>
	#And Enter Last Name as 'J'
	#And Click on Create Leads button
	#Then Verify First Name is displayed as <FirstName>
	
	Examples: 
		|username|password|
		|DemoSalesManager|crmsfa|
		|DemoCSR|crmsfa|
		
