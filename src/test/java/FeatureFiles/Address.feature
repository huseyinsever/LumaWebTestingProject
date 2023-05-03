Feature: Address Functionality

  Background:
    Given Navigate to basqar
    When  Sign In click
      | sıgnIn1 |
    And   valid username or password input
      | eMail    | hasan12345@outlook.com |
      | password | Hasan12345             |
    When  Sign In click
      | sıgnIn2 |


  Scenario Outline: Add Address
    And My Account login
      | changeButton |
      | myAccount    |

    And Manage Address
      | manageAddressClick |
      | newAddresButton    |

    And Filling in the address form
      | phone   | <phoneNumber> |
      | street1 | <street1>     |
      | street2 | <street2>     |
      | street3 | <street3>     |
      | city    | <city>        |
      | zipCode | <zipCode>     |

    And Select State
      | <stateProvince> |

    And Save Button Click
      | saveButton |

    Then verify Address succesfully
      | verifyAddress | <verifySuccesfully> |

    Examples:
      | phoneNumber | street1       | street2       | street3       | city        | zipCode | stateProvince | verifySuccesfully     |
      | 06346453456 | Gümüskaya Cd. | Gümüskaya Cd. | Gümüskaya Cd. | LOS ANGELES | 35555   | 9             | You saved the address |
      | 3423945464  | Ulubatlı Mh.  | Ulubatlı Mh.  | Ulubatlı Mh.  | BAKU        | 56666   | 14            | You saved the address |
      | 54764542344 | Canova Cd.    | Canova Cd.    | Canova Cd.    | MADRİD      | 574444  | 18            | You saved the address |



