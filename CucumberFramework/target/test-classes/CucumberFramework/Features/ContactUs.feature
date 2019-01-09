Feature: Submit data to webdriveruniversity.com using contact us form


Scenario: Submit valid data using contact us form
	Given User navigates to contact us form
	And User enter valid firstname
	And User enter valid lastname
	|Woods | Jackson | Krishnaswamy |
	And User enter email valid email address
	And User enter valid comments
	|example comment one | example comment two |
	When User click on submit button
	Then the information should successfully be submitted