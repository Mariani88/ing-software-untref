Feature: Ejercicio1

Scenario: Piedra vs Tijera
  Given jugador1 juega PIEDRA
  When jugador2 juega TIJERA
  Then gana jugador1