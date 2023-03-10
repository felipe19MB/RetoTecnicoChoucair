Feature: Exito test

  Scenario Outline: Selection of random products

    Given The user enters page and select a "<category>" and "<subcategory>"
    When The user selects a random product and take between 1 and 10 of it
    Then the result on the cart should be ok

    Examples:
      | category   | subcategory             |
      | Tecnología | Monitores               |

