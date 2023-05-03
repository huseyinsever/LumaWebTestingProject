Feature: Register Functionality

  Scenario: Register by entering appropriate data on the site

    Given Navigate to basqar
    When  Click Create ann Account
    |createAccount|

    And   Filling out the form
      | firstName       | Hasan                  |
      | lastName        | solmaz                 |
      | eMail           | hasan12345@outlook.com |
      | password        | Hasan12345             |
      | confirmPassword | Hasan12345             |

    When  Click Create ann Account
      |createAccountButton|

    Then  verify succesfully
    |verifyAccount|Thank you|