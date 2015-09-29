Feature: Ejercicio1

Scenario: Piedra vs Tijera
  Given jugador1 juega PIEDRA
  When jugador2 juega TIJERA
  Then gana jugador1
  
  Scenario: Tijera vs Piedra
  Given jugador1 juega TIJERA
  When jugador2 juega PIEDRA
  Then gana jugador2
  
   Scenario: Tijera vs Tijera
  Given jugador1 juega TIJERA
  When jugador2 juega TIJERA
  Then empate
  
  