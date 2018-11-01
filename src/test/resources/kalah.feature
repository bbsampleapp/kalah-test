Feature: Play Kalah
  As a player
  I want to start a game of Kalah
  and make a move
  so I can win at Kalah

  Scenario: client makes call to POST /games
    When the client calls /games
    Then the client receives status code of 201
    And the client receives a gameid and url

  Scenario: client makes call to PUT /games/{gameid}/pits/{pitid}
    When the client calls '/games/{gameid}/pits/{pitid}'
    Then the client receives status code of 200
    And the client receives a gameid, url and state