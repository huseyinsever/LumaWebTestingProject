Feature: Login Functionality

  Scenario: login with correct data
    Given Navigate to basqar
    When   Sign In click
      | sıgnIn1 |
    And    valid username or password input
      | eMail    | hasan12345@outlook.com |
      | password | Hasan12345             |

    When   Sign In click
      | sıgnIn2 |


