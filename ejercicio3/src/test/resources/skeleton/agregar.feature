Feature: agregar

Background: existe un destructor en tablero del jugador 
Given jugador tiene un barco en la posicion 0 2 HORIZONTALMENTE 


Scenario: jugador1 agrega un barco exitosamente  
When jugador agrega un destructor en posicion 0 0 VERTICALMENTE
Then jugador obtiene "barco agregado"