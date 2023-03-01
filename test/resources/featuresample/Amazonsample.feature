@amazon
Feature: User has to order a book on Amazon
User has to be successful in this task

 @launch  
  Scenario: A
  
  Given Application needs to be launched
  When user gives the website link
  Then user searches for the book
  And user clicks on the book
  And Set the quantity
  When user sets the quantity to 2
  Then add book to the cart
