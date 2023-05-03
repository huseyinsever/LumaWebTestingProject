Feature: Place purchase Functionality

  Background:
    Given Navigate to basqar
    When   Sign In click
      | sıgnIn1 |
    And    valid username or password input
      | eMail    | hasan12345@outlook.com |
      | password | Hasan12345             |
    When   Sign In click
      | sıgnIn2 |

  Scenario Outline: Place Order Purchase
    Given Whats new Click
     | <whatNewButtonEx> |

    And New To product
      | <productClickEx> |

    And Product feature selection
      | <sizeEx>       |
      | <colorEx>      |
      | <addToChartEx> |

    And Verify Product Succesfully
      | <productVerifysuccesfullyEx> |You added Phoebe Zipper Sweatshirt to your shopping cart.|

    And My Chart Click
      | <myCartEx>           |
      | <procedToCheckoutEx> |

    And Shipping method
      | <inputRadioEx> |
      | <nextEx>       |

    And Payment method
      | <placeOrderEx> |

    Then Verify Message succesfully
      | <verifyOrderMessageEx> | Thank you for your purchase! |

      Examples:
        | whatNewButtonEx | productClickEx | sizeEx | colorEx | addToChartEx | productVerifysuccesfullyEx | myCartEx | procedToCheckoutEx | inputRadioEx | nextEx | placeOrderEx | verifyOrderMessageEx |
        | whatNewButton   | productClick   | size   | color   | addToChart   | productVerifysuccesfully   | myCart   | procedToCheckout   | inputRadio   | next   | placeOrder   | verifyOrderMessage   |






