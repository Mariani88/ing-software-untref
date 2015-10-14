Feature: Disparar

Background: enemigo tiene tres barcos en el mapa: un acorazado y dos destructores
Given jugador tiene un destructor en la posicion 0 0 HORIZONTALMENTE 
And jugador tiene un destructor en la posicion 1 0 VERTICALMENTE
And jugador tiene un acorazado en la posicion 1 3 HORIZONTALMENTE 
 
Scenario: Disparo y toco agua
When jugador dispara a la posicion 1 1
Then jugador luego de disparar obtiene "toco agua"


Scenario: Disparo y toco un barco pero no lo hundo
When jugador dispara a la posicion 0 0
Then jugador luego de disparar obtiene "barco averiado"

Scenario: Disparo y toco un barco y lo hundo
When jugador dispara a la posicion 0 0
And jugador dispara a la posicion 0 1
And jugador dispara a la posicion 0 2
Then jugador luego de disparar obtiene "barco hundido"

Scenario: Disparo a una posicion invalida
When jugador dispara a la posicion 10 0
Then jugador luego de disparar obtiene "posicion invalida"


