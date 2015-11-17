Feature: calculo del envido

Scenario: el jugador tiene 3 cartas de distinto palo
Given el jugador tiene 3 de copa, 3 de espada y 3 de oro
When el jugador canta envido
Then el envido es 3

Scenario: el jugador tiene una carta negra y una blanca, del mismo palo
Given el jugador tiene 3 de copa, 12 de oro y 3 de oro
When el jugador canta envido
Then el envido es 23

Scenario: el jugador tiene dos cartas blancas del mismo palo
Given el jugador tiene 3 de copa, 7 de oro y 6 de oro
When el jugador canta envido
Then el envido es 33

Scenario: el jugador tiene 3 cartas del mismo palo. 
Given el jugador tiene 7 de oro, 6 de oro y 5 de oro
When el jugador canta envido
Then el envido es 33