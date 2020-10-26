@web
Feature: Purchase Product

  Scenario Outline: Purchase product
    Given Customer opens "<DemoOnlineShop>" homepage
    When Customer clicks on "<ProductCategory>" product category
    And Customer clicks on "<Product1>" product
    Then Customer navigates to the "<Product1>" product page
    And Customer adds the products to the cart
    Then Customer accepts the confirmation alert
    #When Customer navigates back
    When Customer clicks on "Home" menu
    And Customer clicks on "<ProductCategory>" product category
    When Customer clicks on "<Product2>" product
    Then Customer navigates to the "<Product2>" product page
    And Customer adds the products to the cart
    Then Customer accepts the confirmation alert
    When Customer clicks on "Cart" menu

    Examples:
      | DemoOnlineShop                        | ProductCategory | Product1      | Product2    |
      | https://www.demoblaze.com/index.html  | Laptops         | Sony vaio i5  | Dell i7 8gb |

    #Then Customer deletes product "<Product2>" from Cart
    #When Customer clicks on "Place Order" button
    #Then Webform opens up
    #When Customer fills Name, Country, City, Credit card, Month and Year and submits webform
      #| Name             | Country | City       | Credit card | Month | Year |
      #| Ratika Batra     | India   | Ghaziabad  | 1234        | Jan   | 2020 |
    #And Customer calculates the bill amount
    #Then Confirmation popup appears with purchase ID and correct bill amount
    #When Customer accepts the confirmation popup
    #Then Customer is navigated to home page


