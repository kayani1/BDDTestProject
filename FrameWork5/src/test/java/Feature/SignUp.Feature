Feature: Register New User
Scenario: New User should be able to register successfully
Given New User enter the valid url "http://newtours.demoaut.com/" and click on Register button
When New user enter the Contact info FName "Robin" LName "Bush" Phone "2123334454" Email "Bush@test.com"
And Mailing Info Address "223 45st" City "NYC" State "NY" PCode "11107"
Then New User enter the user information UName "RBush" Password "Test@1234" CPassword "Test@1234" and click Submit button.