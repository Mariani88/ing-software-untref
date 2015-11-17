Feature: calculo del envido

Scenario: el jugador tiene 3 cartas de distinto palo
Given el jugador tiene 3 de copa, 3 de espada y 3 de oro
When el jugador canta envido
Then el envido es 3