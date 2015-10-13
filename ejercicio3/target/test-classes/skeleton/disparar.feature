Feature: Disparar

Background: enemigo tiene tres barcos en el mapa: un acorazado y dos destructores
Given jugador tiene un destructor en la posicion 0 0 HORIZONTALMENTE 
And jugador tiene un destructor en la posicion 1 0 VERTICALMENTE
And jugador tiene un acorazado en la posicion 1 3 HORIZONTALMENTE 
 
Scenario: Disparo y toco agua
When jugador dispara a la posicion 1 1
Then jugador luego de disparar obtiene "toco agua"
