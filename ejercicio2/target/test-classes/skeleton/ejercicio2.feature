Feature: ejercicio2

Background: la palabra secreta es AUTO
Given la palabra secreta es "auto"

Scenario: usuario arriesga letra minuscula y acierta
Given la palabra secreta es "auto"
When arriesgo "a"
Then estado es "a***"
And me quedan 7 vidas

Scenario: usuario arriesga letra mayuscula y acierta
Given la palabra secreta es "auto"
When arriesgo "A"
Then estado es "a***"
And me quedan 7 vidas

Scenario: usuario arriesga y se equivoca
Given la palabra secreta es "auto"
When arriesgo "x"
Then estado es "****"
And me quedan 6 vidas

Scenario: usuario pierde el juego
Given la palabra secreta es "auto" 
And me quedan 1 vida
When arriesgo "x"
Then estado es "****"
And resultado "ahorcado"






