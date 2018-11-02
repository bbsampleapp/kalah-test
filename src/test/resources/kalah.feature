Feature: Play Kalah
  As a player
  I want to start a game of Kalah
  and make a move
  so I can win at Kalah

  Scenario: client makes call to POST /games
    When the client calls /games
    Then the client receives a gameid, url and status code '201'

  Scenario: client makes call to PUT /games/{gameid}/pits/{pitid}
    Given the client calls /games
    When the client calls /games/gamieid/pits/pitid
    Then the client receives a gameid, url, state and status code '200'