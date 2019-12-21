Feature: End to End feature

Scenario: buy a toys
Given open chrome browser - pre condition will be under given
And navigate to url
When search toys in search text box - action will be under when
And user click in search button - and meaning continue
And user click in christmas toys
And user add the product in the shopping cart
And user submit order 
Then user should get a confirmation number and email - 