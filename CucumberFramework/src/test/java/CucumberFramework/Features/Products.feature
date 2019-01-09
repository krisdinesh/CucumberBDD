Feature: Products page

Scenario Outline: validate promo code alert is visible when clicking on the special offers link
	Given User naviagates "<url>" website
	When  User click on the product "<button>"
	Then User should be presented with a promo alert 
	
	Examples:
	| url                                							     | button                    |
	| http://www.webdriveruniversity.com/Page-Object-Model/products.html | #container-special-offers |