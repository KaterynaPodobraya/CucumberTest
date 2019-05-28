 Feature: RP5STeps
 #Comment
 Scenario Outline: Examine weather forecast
   Given rp site is opened
   When user selects <stepCity>
   Then forecast is shown <resultCity>

 Examples:
 |stepCity  |resultCity|
 |Kiev      |Kiev      |
