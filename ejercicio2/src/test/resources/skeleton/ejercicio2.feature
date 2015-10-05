Feature: ejercicio2

Scenario: usuario arriesga letra minuscula y acierta
Given la palabra secreta es "auto"
When arriesgo "a"
Then estado es "a***"
And me quedan 7 vidas