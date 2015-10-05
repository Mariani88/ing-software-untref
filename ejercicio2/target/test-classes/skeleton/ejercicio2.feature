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



