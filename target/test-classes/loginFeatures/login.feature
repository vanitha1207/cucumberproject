Feature: To validate the functionality of facebook
Scenario: To validate the facebook by invalid username and invalid password

When User should type invalid username and invalid password
|vanitha12|vanitha123|avoi123|abi123|
And User should click the login button
And To print the title of the webpage
Then It will navigate to invalid credential page
@smoke 
Scenario: To validate the facebook by valid username and invalid password
When User should type valid username in the invalid password text box
|vanitha12|vanitha123|
|avoi123|abi123|
And User should click the login button
Then It will navigate to invalid credential page
@sanity
Scenario: To validate the facebook by invalid username and valid password
When User should type invalid username and valid password text box
|user|vanitha123|
|pass|abi123|
And User should click the login button
Then It will navigate to invalid credential page
@regression
Scenario: To validate the facebook by valid username and valid password
When User should type valid username and valid password text box
|user|pass|
|vanitha12|vanitha123|
|avoi123|abi123|

And User should click the login button 
Then It will navigate  to invalid credential page
 
