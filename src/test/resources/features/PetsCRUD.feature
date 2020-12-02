@api
Feature: Get, Create, update and delete Pets using APIs

Scenario Outline: Get all available pets, create a new pet and update its status to sold and then delete it
  Given User makes a GET request to get all the pets with "avaialble" status
  And User verify that pet "<PetName>" is not in "available" pets list
  When User makes a POST request to add a new pet "<PetName>"
  Then User verify that pet "<PetName>" is in "available" pets list
  And User makes a PUT request to update status of pet "<PetName>" to "sold"
  And User makes a GET request to get all the pets with "avaialble" status
  Then User verify that pet "<PetName>" is not in "available" pets list
  And User makes a GET request to get all the pets with "sold" status
  And User verify that pet "<PetName>" is in "sold" pets list
  When User makes a DELETE request to delete the pet "<PetName>"
  And User makes a GET request to get all the pets with "avaialble" status
  Then User verify that pet "<PetName>" is not in "available" pets list
  And User makes a GET request to get all the pets with "sold" status
  And User verify that pet "<PetName>" is not in "sold" pets list

  Examples:
    | PetName           |
    | PetAddedByRatika  |



