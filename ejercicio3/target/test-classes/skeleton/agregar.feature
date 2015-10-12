Feature: agregar barco

Background: existe un destructor en tablero del jugador 
Given jugador tiene un barco en la posicion 0 2 HORIZONTALMENTE 


Scenario: jugador1 agrega un barco exitosamente  
When jugador agrega un destructor en posicion 0 0 VERTICALMENTE
Then jugador obtiene "barco agregado"

Scenario: jugador ubica un barco en una posición ya ocupada
When jugador agrega un destructor en posicion 0 2 HORIZONTALMENTE
Then jugador obtiene "posicion ocupada"

Scenario: jugador ubica un barco en una posición fuera del tablero
When jugador agrega un destructor en posicion 10 2 HORIZONTALMENTE
Then jugador obtiene "posicion invalida para ubicar barco"

