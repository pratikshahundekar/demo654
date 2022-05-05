Feature: Test facebook application functinality

  Scenario Outline: create multiple new users
    Given user is on fb regiser page
    When user enter "<firstname>", "<lastname>", "<MobNo>", "<password>"
    And user "<monthDp>" and "<yeardp>"
    Then user will be created

    Examples: 
      | firstname | lastname | MobNo       | password    | monthDp | yeardp |
      | Harshali  | Mahajan  |  9898988989 | harshali123 | Aug     |   2010 |
      | snehal    | Ghavare  |   855888555 | snehal123   | Nov     |   2020 |
      | Kunal     | Patil    | 54544545656 | kunal123    | Dec     |   2015 |
